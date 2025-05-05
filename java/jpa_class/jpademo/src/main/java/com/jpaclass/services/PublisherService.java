package com.jpaclass.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jpaclass.entity.PublisherUniDirQ5;
import com.jpaclass.entity.TitleQue5Entity;

import jakarta.persistence.EntityManager;

public class PublisherService {
    public void createPublisheTitle(EntityManager em) {
        try (Scanner in = new Scanner(System.in);) {
            System.out.println("Enter The Book Title:- ");
            String title = in.nextLine();
            System.out.println("Enter The Name of the Publisher:- ");
            String publisherName = in.nextLine();

            TitleQue5Entity tqe = new TitleQue5Entity(title);
            List<TitleQue5Entity> listTitle = new ArrayList<>();
            listTitle.add(tqe);
            PublisherUniDirQ5 pud = new PublisherUniDirQ5(publisherName, listTitle);

            em.persist(pud);
            em.close();

        } catch (Exception e) {
            System.out.println("Error:- " + e.getMessage());
            e.printStackTrace();

        }

    }

}
