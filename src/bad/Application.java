package bad;

import java.util.ArrayList;

import model.Customer;

public class Application {
    public static void main(String[] args) {
        InvoiceProcessor invoiceProcessor = new InvoiceProcessor();
        invoiceProcessor.generateAndSendInvoice(new Customer(1, "Sertaç", "Yarbaş"), new ArrayList<>());
    }
}