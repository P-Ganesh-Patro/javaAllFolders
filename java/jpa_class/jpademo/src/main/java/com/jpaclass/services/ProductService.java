package com.jpaclass.services;

import java.util.List;
import java.util.Scanner;

import com.jpaclass.entity.ProductEntity;

import jakarta.persistence.EntityManager;

public class ProductService {

    public void createProduct(EntityManager em) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the Product Name:- ");
            String productName = in.nextLine();
            System.out.println("Enter the product price:- ");
            double productPrice = in.nextDouble();
            in.nextLine();
            System.out.println("Enter the product Features:- ");
            String prodFeatures = in.nextLine();
            ProductEntity pe = new ProductEntity(productName, productPrice, prodFeatures);
            em.persist(pe);
            System.out.println("Product Details Saved...");
        } catch (Exception e) {
            System.out.println("Error:- " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void displayProducts(EntityManager em) {
        try {
            List<ProductEntity> products = em
                    .createQuery("select s from ProductEntity s", ProductEntity.class)
                    .getResultList();
            for (ProductEntity product : products) {
                System.out.println(product);
            }
            em.close();
        } catch (Exception e) {
            System.out.println("Error:- " + e.getMessage());
            e.printStackTrace();
        }

    }

}
