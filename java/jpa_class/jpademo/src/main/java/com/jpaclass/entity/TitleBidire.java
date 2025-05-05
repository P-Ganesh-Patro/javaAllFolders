package com.jpaclass.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Titles_Table")
public class TitleBidire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title_name;

    @ManyToOne
    @JoinColumn(name="published_id")
    private PublisherBiDir publisher;

    public TitleBidire() {
    }

    public TitleBidire(String title_name, PublisherBiDir publisher) {
        this.title_name = title_name;
        this.publisher = publisher;
    }

    public String getTitle_name() {
        return title_name;
    }

    public void setTitle_name(String title_name) {
        this.title_name = title_name;
    }

    public PublisherBiDir getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherBiDir publisher) {
        this.publisher = publisher;
    }

}
