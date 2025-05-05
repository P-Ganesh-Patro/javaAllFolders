package com.jpaclass.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @Column(name = "Customer Email", unique = true, length = 100)
    private String cust_email;

    @Column(name = "Contact", unique = true, length = 10)
    private String mobile_number;

    public CustomerEntity(String name, String cust_email, String mobile_number) {
        this.name = name;
        this.cust_email = cust_email;
        this.mobile_number = mobile_number;
    }

    public CustomerEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCust_email() {
        return cust_email;
    }

    public void setCust_email(String cust_email) {
        this.cust_email = cust_email;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    @Override
    public String toString() {
        return "CustomerEntity [id=" + id + ", name=" + name + ", cust_email=" + cust_email + ", mobile_number="
                + mobile_number + "]";
    }

}
