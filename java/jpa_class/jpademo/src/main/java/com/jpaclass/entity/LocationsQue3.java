package com.jpaclass.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class LocationsQue3 {
    private String institutename;
    private String address;
    private String city;

    public LocationsQue3(String institutename, String address, String city) {
        this.institutename = institutename;
        this.address = address;
        this.city = city;
    }

    public LocationsQue3() {
    }

    public String getInstitutename() {
        return institutename;
    }

    public void setInstitutename(String institutename) {
        this.institutename = institutename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
