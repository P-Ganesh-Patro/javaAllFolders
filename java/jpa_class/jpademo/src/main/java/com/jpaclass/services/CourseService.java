package com.jpaclass.services;

import java.util.Scanner;
import jakarta.persistence.EntityManager;
import com.jpaclass.entity.CourseQue3Entity;
import com.jpaclass.entity.LocationsQue3;

public class CourseService {

    public CourseQue3Entity createCourse(EntityManager em) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter Course Title:- ");
            String courseTitle = in.nextLine();
            System.out.println("Enter Course Fee:- ");
            int courseFee = in.nextInt();

            in.nextLine();
            System.out.println("Enter Institute Name:- ");
            String instituteName = in.nextLine();
            System.out.println("Enter The Address:- ");
            String address = in.nextLine();
            System.out.println("Enter The City Name:- ");
            String city = in.nextLine();
            LocationsQue3 lq = new LocationsQue3(instituteName, address, city);
            CourseQue3Entity cqe = new CourseQue3Entity(courseTitle, courseFee, lq);

            em.persist(cqe);
            System.out.println("Course data Submitted..");
            return cqe;

        } catch (Exception e) {
            System.out.println("Error:- " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
