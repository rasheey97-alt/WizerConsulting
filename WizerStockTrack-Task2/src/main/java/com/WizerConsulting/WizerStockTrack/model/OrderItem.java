package com.WizerConsulting.WizerStockTrack.model;

import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;

    // Define ManyToOne relationship with Order
    @ManyToOne
    @JoinColumn(name = "order_id") // This defines the foreign key in the order_item table
    private Order order;

    // Define ManyToOne relationship with Product
    @ManyToOne
    @JoinColumn(name = "product_id") // This defines the foreign key in the order_item table
    private Product product;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
