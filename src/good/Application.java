package good;

import java.util.ArrayList;

import good.invoice.impl.EmailSenderImpl;
import good.invoice.impl.InvoiceCreatorImpl;
import good.invoice.impl.InvoiceSaverImpl;
import good.invoice.impl.OrderValidatorImpl;
import good.invoice.impl.PdfGeneratorImpl;
import good.invoice.impl.TotalAmountCalculatorImpl;
import model.Customer;

public class Application {
    public static void main(String[] args) {
        InvoiceProcessor invoiceProcessor = new InvoiceProcessor(new OrderValidatorImpl(), new TotalAmountCalculatorImpl(),
                new InvoiceCreatorImpl(), new InvoiceSaverImpl(), new PdfGeneratorImpl(), new EmailSenderImpl());
        
        invoiceProcessor.processInvoice(new Customer(1, "Sertaç", "Yarbaş"), new ArrayList<>());
    }
}
