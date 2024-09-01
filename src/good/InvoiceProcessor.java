package good;

import java.util.List;

import good.invoice.EmailSender;
import good.invoice.InvoiceCreator;
import good.invoice.InvoiceSaver;
import good.invoice.OrderValidator;
import good.invoice.PdfGenerator;
import good.invoice.TotalAmountCalculator;
import model.Customer;
import model.Order;

public class InvoiceProcessor {
    private final OrderValidator orderValidator;
    private final TotalAmountCalculator totalAmountCalculator;
    private final InvoiceCreator invoiceCreator;
    private final InvoiceSaver invoiceSaver;
    private final PdfGenerator pdfGenerator;
    private final EmailSender emailSender;

    public InvoiceProcessor(OrderValidator orderValidator, TotalAmountCalculator totalAmountCalculator,
            InvoiceCreator invoiceCreator, InvoiceSaver invoiceSaver, PdfGenerator pdfGenerator, EmailSender emailSender) {
        this.orderValidator = orderValidator;
        this.totalAmountCalculator = totalAmountCalculator;
        this.invoiceCreator = invoiceCreator;
        this.invoiceSaver = invoiceSaver;
        this.pdfGenerator = pdfGenerator;
        this.emailSender = emailSender;
    }

    public void processInvoice(Customer customer, List<Order> orders) {
        InvoiceContext context = new InvoiceContext(customer, orders);

        orderValidator.validateOrders(context);
        totalAmountCalculator.calculateTotalAmount(context);
        invoiceCreator.createInvoice(context);
        invoiceSaver.saveInvoiceToDatabase(context);
        pdfGenerator.generateInvoicePDF(context);
        emailSender.sendInvoiceEmail(context);
    }
}