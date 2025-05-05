package com.jpaclass.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sales")
public class SalesEntityQue5 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int quantity;

    @ManyToOne
    @JoinColumn(name="product_id")
    private ProductsEntityQue6 product;

    public SalesEntityQue5() {
    }

    public SalesEntityQue5(int quantity, ProductsEntityQue6 productsEntityQue6) {
        this.quantity = quantity;
        product = productsEntityQue6;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductsEntityQue6 getProductsEntityQue6() {
        return product;
    }

    public void setProductsEntityQue6(ProductsEntityQue6 productsEntityQue6) {
        product = productsEntityQue6;
    }

    @Override
    public String toString() {
        return "SalesEntityQue5 [quantity=" + quantity + ", ProductsEntityQue6=" + product + "]";
    }
    
}
