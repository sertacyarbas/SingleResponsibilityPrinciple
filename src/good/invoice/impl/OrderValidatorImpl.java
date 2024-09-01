package good.invoice.impl;

import good.InvoiceContext;
import good.invoice.OrderValidator;

public class OrderValidatorImpl implements OrderValidator {

    @Override
    public void validateOrders(InvoiceContext context) {
        System.out.println("Siparişleri doğrula");
    }
}