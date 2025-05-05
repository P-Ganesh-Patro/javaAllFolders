package com.jpaclass.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Course")
public class CourseQue3Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String course;
    private int fee;
    
    @Embedded
    private LocationsQue3 location;

   
    public CourseQue3Entity(String course, int fee, LocationsQue3 location) {
        this.course = course;
        this.fee = fee;
        this.location = location;
    }

    public CourseQue3Entity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public LocationsQue3 getLocation() {
        return location;
    }

    public void setLocation(LocationsQue3 location) {
        this.location = location;
    }

}
