package com.WizerConsulting.model;

import jakarta.persistence.*;

import java.util.List;



@Entity
@Table(name = "customers")
public class Customer {


    @Id
    @Column(name = "phoneNumber")
    private String phoneNumber;
    private String name;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    // Constructors
    public Customer() {}

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

