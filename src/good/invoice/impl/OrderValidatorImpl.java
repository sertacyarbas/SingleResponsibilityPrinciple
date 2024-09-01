package good.invoice.impl;

import good.InvoiceContext;
import good.invoice.OrderValidator;
import model.Order;

public class OrderValidatorImpl implements OrderValidator {
    @Override
    public void validateOrders(InvoiceContext context) {
        for (Order order : context.getOrders()) {
            if (!order.isValid()) {
                throw new IllegalArgumentException("Invalid order: " + order.getId());
            }
        }
    }
}