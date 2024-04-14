package com.satheeshtech.studentsystem.model;


@jakarta.persistence.Entity
@jakarta.persistence.Table (name="student")
public class Student {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;

    public Student() {
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
