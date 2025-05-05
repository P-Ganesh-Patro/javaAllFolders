package com.jpaclass.questions;

import com.jpaclass.services.CustomerService;

import jakarta.persistence.EntityManager;
import com.jpaclass.entity.CustomerEntity;

public class Question1 {

    public void executeQue1(EntityManager em, CustomerService cs, CustomerEntity ce) {
        try {
            ce.setCust_email("suhas123@gmail.com");
            ce.setName("ram suhas");
            ce.setMobile_number("6290897653");
            // cs.createCustomer(em, ce);
            // cs.customerGetById(em, 1);
            // cs.customerUpdateById(em, 2, "manoj123@gmail.com" , "manoj
            // naidu","7735975409");
            // cs.customerDeleteById(em, 1);
            cs.getAllCustomers(em);
        } catch (Exception e) {
            System.out.println("Error:- " + e.getMessage());
            e.printStackTrace();
        }

    }

}
