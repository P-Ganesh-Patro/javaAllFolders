package com.jpa;

import com.jpa.Model.Category;
import com.jpa.Services.CategoryService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityTransaction et = null;
        CategoryService cs = new CategoryService();
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver");
                EntityManager em = emf.createEntityManager()) {
            // PassportService pps = new PassportService();
            // PersonService ps = new PersonService();
            et = em.getTransaction();
            et.begin();
            // pps.persistThePassport(em);
            // ps.persistThePerson(em);
            // Category cat = cs.findByIdCat(em, 8);
            // System.out.println("Category id:- " + cat);



            
            et.commit();
        } catch (Exception e) {
            if (et != null && et.isActive()) {
                et.rollback();
            }
            System.out.println("Error:- " + e.getMessage());
            e.printStackTrace();
        }
    }
}
