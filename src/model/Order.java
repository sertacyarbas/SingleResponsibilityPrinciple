package model;

import java.util.List;

public class Order {

    private String id;
    private List<Item> items;
    private double totalAmount;
    private Customer customer;

    public Order(String id, List<Item> items, Customer customer) {
        this.id = id;
        this.items = items;
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getCustomerEmail() {
        return customer != null ? customer.getEmail() : null;
    }

    public boolean isValid() {
        return items != null && !items.isEmpty() && customer != null;
    }
}