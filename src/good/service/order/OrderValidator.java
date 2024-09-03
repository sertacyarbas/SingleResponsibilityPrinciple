package good.service.order;

import model.OrderContext;

public interface OrderValidator {
    void validate(OrderContext context);
}