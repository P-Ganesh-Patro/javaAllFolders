package com.jpaclass.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class ProductsQue2Entity {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "Product Name", length = 25)
    private String prod_name;

    @Column(name = "Product Price")
    private double prod_price;

    public ProductsQue2Entity() {
    }

    public ProductsQue2Entity(String prod_name, double prod_price) {
        this.prod_name = prod_name;
        this.prod_price = prod_price;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public double getProd_price() {
        return prod_price;
    }

    public void setProd_price(double prod_price) {
        this.prod_price = prod_price;
    }

    @Override
    public String toString() {
        return "ProductsQue2Entity [prod_name=" + prod_name + ", prod_price=" + prod_price + "]";
    }

}
