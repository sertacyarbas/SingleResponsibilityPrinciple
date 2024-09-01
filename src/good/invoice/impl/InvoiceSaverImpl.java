package good.invoice.impl;

import good.InvoiceContext;
import good.invoice.InvoiceSaver;

public class InvoiceSaverImpl implements InvoiceSaver {
    @Override
    public void saveInvoiceToDatabase(InvoiceContext context) {
        System.out.println("Faturayı veritabanına kaydet");
    }
}