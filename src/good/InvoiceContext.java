package good;

import java.util.List;

import model.Customer;
import model.Invoice;
import model.Order;

public class InvoiceContext {
    private Customer customer;
    private List<Order> orders;
    private double totalAmount;
    private Invoice invoice;
    private byte[] pdfData;

    public InvoiceContext(Customer customer, List<Order> orders) {
        this.customer = customer;
        this.orders = orders;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public byte[] getPdfData() {
        return pdfData;
    }

    public void setPdfData(byte[] pdfData) {
        this.pdfData = pdfData;
    }

    // Getter ve setter metodları
}