package good.invoice;

import good.InvoiceContext;

public interface InvoiceSaver {
    void saveInvoiceToDatabase(InvoiceContext context);
}
