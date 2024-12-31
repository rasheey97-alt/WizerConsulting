package com.WizerConsulting.model;

import jakarta.persistence.*;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "orders")
public class Order {

    @Setter
    private final Product product;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date orderDate;
    private String customerName;
    private String customerPhone;
    private double totalAmount;


    @ManyToOne
    @JoinColumn(name = "customerPhoneNumber", nullable = false)
    private Customer customer;

    @ManyToMany
    @JoinTable(
            name = "order_products",
            joinColumns = @JoinColumn(name = "orderId"),
            inverseJoinColumns = @JoinColumn(name = "productId")
    )
    private List<Product> products;

    // Constructors
    public Order(Product product) {
        this.product = product;
    }

    public Order(String customerName, String customerPhone, double totalAmount, Product product) {
        this.orderDate = new Date();
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.totalAmount = totalAmount;
        this.product = product;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Product getProduct() {
        return product;
    }

}
