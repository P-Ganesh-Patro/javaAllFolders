package com.jpaclass.questions;

import jakarta.persistence.EntityManager;
import com.jpaclass.services.ProductService;;

public class Questions3 {
    public void executeQue3(EntityManager em) {
        ProductService ps = new ProductService();
        try {
            ps.displayProducts(em);
            // ps.createProduct(em);

        } catch (Exception e) {
            System.out.println("Error:- " + e.getMessage());
            e.printStackTrace();

        }
    }

}
