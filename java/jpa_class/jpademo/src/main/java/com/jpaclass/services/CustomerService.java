package com.jpaclass.services;

import java.util.List;

import com.jpaclass.entity.CustomerEntity;

import jakarta.persistence.EntityManager;

public class CustomerService {

    public void createCustomer(EntityManager em, CustomerEntity cs) {
        em.persist(cs);
        System.out.println("customer details saved..");

    }

    public void customerGetById(EntityManager em, int id) {
        CustomerEntity ce = em.find(CustomerEntity.class, id);
        if (ce != null) {
            System.out.println(ce.getName());
            System.out.println(ce);
        }
        System.out.println("data getting..");
    }

    public void customerUpdateById(EntityManager em, int id, String eMail, String name, String mobileNumber) {

        try {
            CustomerEntity ce = em.find(CustomerEntity.class, id);
            if (ce != null) {
                ce.setCust_email(eMail);
                ce.setName(name);
                ce.setMobile_number(mobileNumber);
            } else {
                System.out.println("id not found");
            }
            System.out.println("Customer data updated...");

            em.close();
        } catch (Exception e) {
            System.out.println("error:- updated.." + e.getMessage());
            e.printStackTrace();

        }

    }

    public void customerDeleteById(EntityManager em, int id) {
        try {
            CustomerEntity ce = em.find(CustomerEntity.class, id);
            if (ce != null) {
                em.remove(ce);
                em.close();

            } else {
                System.out.println("Id Not Found...");
            }
            System.out.println(id + " customer deleted...");

        } catch (Exception e) {
            System.out.println("error- deleted.." + e.getMessage());
            e.printStackTrace();
        }
    }

    public void getAllCustomers(EntityManager em) {
        try {
            List<CustomerEntity> customers = em.createQuery("from CustomerEntity", CustomerEntity.class).getResultList();
            for (CustomerEntity customer : customers) {
                System.out.println("Customers:- " + customer);
            }

        } catch (Exception e) {
            System.out.println("all customers:- " + e.getMessage());
            e.printStackTrace();
        }

    }
}
