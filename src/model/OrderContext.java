package model;

public class OrderContext {
    private Order order;
    private boolean isValid;
    private boolean isStockAvailable;
    private double totalAmount;

    public OrderContext(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public boolean isStockAvailable() {
        return isStockAvailable;
    }

    public void setStockAvailable(boolean stockAvailable) {
        isStockAvailable = stockAvailable;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}