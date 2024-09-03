package good.service.order;

import model.OrderContext;

public interface OrderSaver {
    void saveOrder(OrderContext context);
}