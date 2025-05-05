package com.jpaclass.questions;

import com.jpaclass.services.ProductsTakingQ2Service;

import jakarta.persistence.EntityManager;

public class Question2 {
    ProductsTakingQ2Service pts = new ProductsTakingQ2Service();
    public void question2Exec(EntityManager em){
        pts.createProductsTransaction(em);

    }
    
}
