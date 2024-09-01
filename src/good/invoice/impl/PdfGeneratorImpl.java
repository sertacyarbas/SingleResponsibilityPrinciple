package good.invoice.impl;

import good.InvoiceContext;
import good.invoice.PdfGenerator;

public class PdfGeneratorImpl implements PdfGenerator {
    @Override
    public void generateInvoicePDF(InvoiceContext context) {
        System.out.println("Faturayı PDF olarak oluştur");
    }
}