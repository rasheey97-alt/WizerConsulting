package com.WizerConsulting.WizerStockTrack.payload;
import java.util.Date;

public class OrderPayload {
    private String orderId;
    private String customerName;
    private double totalAmount;
    private Date creationDate;

    // Constructors
    public OrderPayload(String orderId, String customerName, double totalAmount, Date creationDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.creationDate = creationDate;
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "OrderPayload{orderId='" + orderId + "', customerName='" + customerName + "', totalAmount=" + totalAmount + ", creationDate=" + creationDate + "}";
    }
}



