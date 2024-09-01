package good.invoice.impl;

import good.InvoiceContext;
import good.invoice.EmailSender;

public class EmailSenderImpl implements EmailSender {
    @Override
    public void sendInvoiceEmail(InvoiceContext context) {
        System.out.println("Faturayı e-posta ile gönder");
    }
}
