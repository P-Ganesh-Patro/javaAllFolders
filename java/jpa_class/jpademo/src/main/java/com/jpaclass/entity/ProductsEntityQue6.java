package com.jpaclass.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class ProductsEntityQue6 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Product_Name")
    private String product_name;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    List<SalesEntityQue5> salesEntity;

    public ProductsEntityQue6() {
    }

    public ProductsEntityQue6(String product_name, List<SalesEntityQue5> salesEntity) {
        this.product_name = product_name;
        this.salesEntity = salesEntity;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public List<SalesEntityQue5> getSalesEntity() {
        return salesEntity;
    }

    public void setSalesEntity(List<SalesEntityQue5> salesEntity) {
        this.salesEntity = salesEntity;
    }

    @Override
    public String toString() {
        return "ProductsEntityQue6 [product_name=" + product_name + ", salesEntity=" + salesEntity + "]";
    }

}