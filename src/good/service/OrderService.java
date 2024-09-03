package good.service;

import good.service.order.EmailSender;
import good.service.order.OrderSaver;
import good.service.order.OrderValidator;
import good.service.order.PriceCalculator;
import good.service.order.StockChecker;
import model.Order;
import model.OrderContext;

public class OrderService {
    private final OrderValidator orderValidator;
    private final StockChecker stockChecker;
    private final PriceCalculator priceCalculator;
    private final OrderSaver orderSaver;
    private final EmailSender emailSender;

    public OrderService(OrderValidator orderValidator,
            StockChecker stockChecker,
            PriceCalculator priceCalculator,
            OrderSaver orderSaver,
            EmailSender emailSender) {
        this.orderValidator = orderValidator;
        this.stockChecker = stockChecker;
        this.priceCalculator = priceCalculator;
        this.orderSaver = orderSaver;
        this.emailSender = emailSender;
    }

    public void processOrder(Order order) {
        OrderContext context = new OrderContext(order);

        orderValidator.validate(context);
        stockChecker.checkStock(context);
        priceCalculator.calculateTotalAmount(context);
        orderSaver.saveOrder(context);
        emailSender.sendOrderConfirmation(context);
    }
}