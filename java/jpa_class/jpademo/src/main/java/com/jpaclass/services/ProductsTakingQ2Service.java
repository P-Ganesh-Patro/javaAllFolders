package com.jpaclass.services;

import java.util.Scanner;
import com.jpaclass.entity.ProductsQue2Entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class ProductsTakingQ2Service {

    public void createProductsTransaction(EntityManager em) {
        EntityTransaction et = em.getTransaction();
        try (Scanner in = new Scanner(System.in);) {
            System.out.println("Enter Product Details 1");
            System.out.println("Enter the Product name:- ");
            String prod_name1 = in.nextLine();
            System.out.println("Enter the product price:- ");
            double prod_price1 = in.nextDouble();
            ProductsQue2Entity pqe1 = new ProductsQue2Entity(prod_name1, prod_price1);
            in.nextLine();
            System.out.println("Enter Product Details 2");
            System.out.println("Enter the Product name:- ");
            String prod_name = in.nextLine();
            System.out.println("Enter the product price:- ");
            double prod_price = in.nextDouble();
            ProductsQue2Entity pqe2 = new ProductsQue2Entity(prod_name, prod_price);
            et.begin();
            em.persist(pqe1);
            em.persist(pqe2);
            System.out.println("Products inserted  successfully..");
            et.commit();

        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
                System.out.println("Transaction failed due to error:- ");
            }
            System.out.println("Error:- " + e.getMessage());
            e.printStackTrace();

        }

    }

}
