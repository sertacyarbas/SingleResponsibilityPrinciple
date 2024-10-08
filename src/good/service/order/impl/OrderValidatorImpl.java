package good.service.order.impl;

import good.service.order.OrderContext;
import good.service.order.OrderValidator;
import model.Order;

public class OrderValidatorImpl implements OrderValidator {
    @Override
    public void validate(OrderContext context) {
        Order order = context.getOrder();
        if (order == null || !order.isValid()) {
            throw new IllegalArgumentException("Geçersiz sipariş.");
        }
    }
}