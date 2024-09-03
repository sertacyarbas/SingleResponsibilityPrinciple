package good.service.order.impl;

import good.service.order.OrderSaver;
import model.Order;
import model.OrderContext;

public class OrderSaverImpl implements OrderSaver {
    @Override
    public void saveOrder(OrderContext context) {
        Order order = context.getOrder();
        // Siparişi veritabanına kaydetme işlemi
        System.out.println("Sipariş veritabanına kaydedildi. ID:" + order.getId());
    }
}