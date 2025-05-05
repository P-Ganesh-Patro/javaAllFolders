package com.jpaclass.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Publisher")
public class PublisherUniDirQ5 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Publisher Name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "publisher_id")
    List<TitleQue5Entity> titles;

    public PublisherUniDirQ5() {
    }

    public PublisherUniDirQ5(String name, List<TitleQue5Entity> titles) {
        this.name = name;
        this.titles = titles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TitleQue5Entity> getTitles() {
        return titles;
    }

    public void setTitles(List<TitleQue5Entity> titles) {
        this.titles = titles;
    }

}