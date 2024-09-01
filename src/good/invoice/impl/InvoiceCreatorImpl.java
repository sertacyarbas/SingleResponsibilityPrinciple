package good.invoice.impl;

import good.InvoiceContext;
import good.invoice.InvoiceCreator;

public class InvoiceCreatorImpl implements InvoiceCreator {
    @Override
    public void createInvoice(InvoiceContext context) {
        System.out.println("Faturayı oluştur");
    }
}