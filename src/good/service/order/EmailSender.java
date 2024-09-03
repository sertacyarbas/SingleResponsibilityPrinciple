package good.service.order;

public interface EmailSender {
    void sendOrderConfirmation(OrderContext context);
}