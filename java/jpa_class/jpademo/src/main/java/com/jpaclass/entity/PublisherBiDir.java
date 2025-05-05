package com.jpaclass.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Publisher_Table")
public class PublisherBiDir {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String publisher_name;

    @OneToMany(mappedBy = "publisher")
    List<TitleBidire> title;

    public PublisherBiDir() {
    }

    public PublisherBiDir(String publisher_name, List<TitleBidire> title) {
        this.publisher_name = publisher_name;
        this.title = title;
    }

    public String getPublisher_name() {
        return publisher_name;
    }

    public void setPublisher_name(String publisher_name) {
        this.publisher_name = publisher_name;
    }

    public List<TitleBidire> getTitle() {
        return title;
    }

    public void setTitle(List<TitleBidire> title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

}
