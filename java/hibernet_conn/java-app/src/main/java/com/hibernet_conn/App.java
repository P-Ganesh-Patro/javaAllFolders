package com.hibernet_conn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Students students = new Students();
        students.setId(18163);
        students.setName("upplapati varma");
        students.setBranch("ECE");

        Configuration config = new Configuration();
        System.out.println(App.class.getClassLoader().getResource("Hibernate.cfg.xml"));

        config.configure("Hibernate.cfg.xml");
        config.addAnnotatedClass(Students.class);

        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();
        session.save(students);
        session.getTransaction().commit();
        System.out.println("Data saved...");

        session.close();
        sf.close();

    }
}
