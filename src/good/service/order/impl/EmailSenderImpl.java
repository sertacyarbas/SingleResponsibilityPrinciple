package good.service.order.impl;

import good.service.order.EmailSender;
import good.service.order.OrderContext;
import model.Order;

public class EmailSenderImpl implements EmailSender {
    @Override
    public void sendOrderConfirmation(OrderContext context) {
        Order order = context.getOrder();
        // Müşteriye sipariş onay e-postası gönderme işlemi
        System.out.println("Sipariş onay e-postası şu adrese gönderildi: " + order.getCustomerEmail());
    }
}