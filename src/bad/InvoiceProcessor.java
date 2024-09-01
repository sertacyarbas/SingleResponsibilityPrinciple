package bad;

import java.util.List;

import model.Customer;
import model.Invoice;
import model.Order;

public class InvoiceProcessor {
    public void generateAndSendInvoice(Customer customer, List<Order> orders) {
        // Siparişleri doğrula
        for (Order order : orders) {
            if (!order.isValid()) {
                throw new IllegalArgumentException("Invalid order: " + order.getId());
            }
        }

        // Toplam tutarı hesapla
        double totalAmount = 0;
        for (Order order : orders) {
            totalAmount += order.getAmount();
        }

        // Faturayı oluştur
        Invoice invoice = new Invoice(customer, orders, totalAmount);

        // Faturayı veritabanına kaydet
        saveInvoiceToDatabase(invoice);

        // Faturayı PDF olarak oluştur
        byte[] pdfData = generateInvoicePDF(invoice);

        // Faturayı e-posta ile gönder
        sendInvoiceEmail(customer, pdfData);
    }

    private void saveInvoiceToDatabase(Invoice invoice) {
        System.out.println("Faturayı veritabanına kaydet");
    }

    private byte[] generateInvoicePDF(Invoice invoice) {
        System.out.println("Faturayı PDF olarak oluştur");
        return new byte[1000];
    }

    private void sendInvoiceEmail(Customer customer, byte[] pdfData) {
        System.out.println("Faturayı e-posta ile gönder");
    }
}