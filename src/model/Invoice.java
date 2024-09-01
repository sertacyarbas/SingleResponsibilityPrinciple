package model;

import java.util.List;

public class Invoice {
    private Customer customer;
    private List<Order> orders;
    private double totalAmount;
    
    public Invoice(Customer customer, List<Order> orders, double totalAmount) {
        this.customer = customer;
        this.orders = orders;
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}