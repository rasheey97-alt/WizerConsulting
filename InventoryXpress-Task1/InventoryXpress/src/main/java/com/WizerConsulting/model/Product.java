package com.WizerConsulting.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;


@Entity
@Table(name = "products")
public class Product {

    @Getter
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private double price;
    private int stock;
    private String description;

    @ManyToMany(mappedBy = "products")
    private List<Order> orders;

    // Constructors
    public Product() {}

    public Product(String name, double price, int stock, String description) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }

    // Getters and Setters



    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {

        this.stock = stock;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}

