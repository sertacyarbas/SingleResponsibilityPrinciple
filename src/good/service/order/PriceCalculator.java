package good.service.order;

import model.OrderContext;

public interface PriceCalculator {
    void calculateTotalAmount(OrderContext context);
}
