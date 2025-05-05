package com.jpaclass.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.jpaclass.entity.PublisherBiDir;
import com.jpaclass.entity.TitleBidire;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PublisherServiceBidir {

    public PublisherBiDir pesisitPublisherBiDir(EntityManager em) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the publisher name: ");
            String publisher_name = in.nextLine();

            PublisherBiDir publisherBidir = new PublisherBiDir(publisher_name, new ArrayList<>());

            em.persist(publisherBidir);

            System.out.println("Publisher saved successfully!");

            return publisherBidir;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        return null;
    }

    public void pesisitTitleBiDir(EntityManager em) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the title name: ");
            String title_name = in.nextLine();

            PublisherBiDir publisherBidir = pesisitPublisherBiDir(em);

            if (publisherBidir != null) {
                TitleBidire title = new TitleBidire(title_name, publisherBidir);

                em.persist(title);

                System.out.println("Title saved successfully!");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
