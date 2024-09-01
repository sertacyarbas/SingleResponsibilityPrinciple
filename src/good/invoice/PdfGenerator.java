package good.invoice;

import good.InvoiceContext;

public interface PdfGenerator {
    void generateInvoicePDF(InvoiceContext context);
}
