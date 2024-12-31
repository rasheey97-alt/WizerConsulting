//package com.WizerConsulting.WizerStockTrack.model;
//
//import jakarta.persistence.*;
//
//import java.math.BigDecimal;
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//public class Product {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//    private BigDecimal price;
//
//    // Define the OneToMany relationship with OrderItem
//    @OneToMany(mappedBy = "product") // Reference the 'product' property in OrderItem
//    private Set<OrderItem> orderItems = new HashSet<>();
//
//    // Getters and Setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    public Set<OrderItem> getOrderItems() {
//        return orderItems;
//    }
//
//    public void setOrderItems(Set<OrderItem> orderItems) {
//        this.orderItems = orderItems;
//    }
//}
