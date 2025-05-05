package com.jpaclass.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jpaclass.entity.ProductsEntityQue6;
import com.jpaclass.entity.SalesEntityQue5;

import jakarta.persistence.EntityManager;

public class ProductsSalesService {
    public void persistProducts(EntityManager em) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter Products Details:- ");
            System.out.println("Enter the products Name:- ");
            String productName = in.nextLine();
            ProductsEntityQue6 product = new ProductsEntityQue6();
            product.setProduct_name(productName);
            List<SalesEntityQue5> salesList = new ArrayList<>();
            System.out.println("Enter the how many sales to add this product ? ");
            int saleCount = Integer.parseInt(in.nextLine());
            for (int i = 1; i <= saleCount; i++) {
                System.out.println("Quantity for sale:- " + i + " ");
                int quantity = Integer.parseInt(in.nextLine());
                SalesEntityQue5 sales = new SalesEntityQue5();
                sales.setQuantity(quantity);
                sales.setProductsEntityQue6(product);

                salesList.add(sales);

            }

            product.setSalesEntity(salesList);
            em.persist(product);
            System.out.println("Product and sales saved successfully.");

        } catch (Exception e) {
            System.out.println("Error:- " + e.getMessage());
            e.printStackTrace();

        }
    }

}
