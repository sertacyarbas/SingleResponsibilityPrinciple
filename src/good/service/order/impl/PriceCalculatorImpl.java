package good.service.order.impl;

import good.service.order.OrderContext;
import good.service.order.PriceCalculator;
import model.Item;
import model.Order;

public class PriceCalculatorImpl implements PriceCalculator {
    @Override
    public void calculateTotalAmount(OrderContext context) {
        Order order = context.getOrder();
        double totalAmount = order.getItems().stream().mapToDouble(Item::getPrice).sum();
        context.setTotalAmount(totalAmount);
        System.out.println("Hesaplanan toplam tutar: " + totalAmount);
    }
}