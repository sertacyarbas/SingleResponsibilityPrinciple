package good.service.order;

import model.OrderContext;

public interface StockChecker {
    void checkStock(OrderContext context);
}