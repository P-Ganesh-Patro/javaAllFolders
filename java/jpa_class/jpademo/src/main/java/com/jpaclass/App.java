package com.jpaclass;

import com.jpaclass.questions.Question2;
import com.jpaclass.questions.Questions3;
// import com.jpaclass.entity.CustomerEntity;
// import com.jpaclass.questions.Question1;
import com.jpaclass.services.CourseService;
import com.jpaclass.services.ProductService;
import com.jpaclass.services.ProductsSalesService;
import com.jpaclass.services.ProductsTakingQ2Service;
import com.jpaclass.services.PublisherService;
import com.jpaclass.services.PublisherServiceBidir;

// import com.jpaclass.services.CustomerService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        // CustomerService cs = new CustomerService();
        // CustomerEntity se = new CustomerEntity();
        // Question1 q1 = new Question1();
        // CourseService cs = new CourseService();
        // ProductService ps = new ProductService();
        // Questions3 q3 = new Questions3();
        PublisherService ps = new PublisherService();
        ProductsSalesService service = new ProductsSalesService();
        Question2 q2 = new Question2();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        // q1
        // q1.executeQue1(em, cs, se);
        // q3
        // cs.createCourse(em);
        // ps.createProduct(em);
        // ps.displayProducts(em);
        // q3.executeQue3(em);
        // q2.question2Exec(em);
        // ps.createPublisheTitle(em);
        // PublisherServiceBidir service = new PublisherServiceBidir();
        // service.pesisitTitleBiDir(em);
        service.persistProducts(em);

        et.commit();
    }
}
