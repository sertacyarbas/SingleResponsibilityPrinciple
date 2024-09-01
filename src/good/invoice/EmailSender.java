package good.invoice;

import good.InvoiceContext;

public interface EmailSender {
    void sendInvoiceEmail(InvoiceContext context);
}
