package com.hibernet_conn;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
    @Id
    private int id;
    private String name;
    private String branch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Students [id=" + id + ", name=" + name + ", branch=" + branch + "]";
    }

}
