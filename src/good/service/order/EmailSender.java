package good.service.order;

import model.OrderContext;

public interface EmailSender {
    void sendOrderConfirmation(OrderContext context);
}