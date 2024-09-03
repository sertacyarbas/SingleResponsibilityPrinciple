package good.service.order.impl;

import good.service.order.StockChecker;
import model.OrderContext;

public class StockCheckerImpl implements StockChecker {
    @Override
    public void checkStock(OrderContext context) {
        // Veritabanından stok kontrolü işlemi
        System.out.println("Sipariş için stok kontrolü: " + context.getOrder().getId());
        context.setStockAvailable(true);
    }
}