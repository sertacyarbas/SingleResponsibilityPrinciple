package good;

import java.util.Arrays;

import good.service.OrderService;
import good.service.order.EmailSender;
import good.service.order.OrderSaver;
import good.service.order.OrderValidator;
import good.service.order.PriceCalculator;
import good.service.order.StockChecker;
import good.service.order.impl.EmailSenderImpl;
import good.service.order.impl.OrderSaverImpl;
import good.service.order.impl.OrderValidatorImpl;
import good.service.order.impl.PriceCalculatorImpl;
import good.service.order.impl.StockCheckerImpl;
import model.Customer;
import model.Item;
import model.Order;

public class Application {
    public static void main(String[] args) {
        OrderValidator orderValidator = new OrderValidatorImpl();
        StockChecker stockChecker = new StockCheckerImpl();
        PriceCalculator priceCalculator = new PriceCalculatorImpl();
        OrderSaver orderSaver = new OrderSaverImpl();
        EmailSender emailSender = new EmailSenderImpl();

        OrderService orderService = new OrderService(orderValidator, stockChecker, priceCalculator, orderSaver,
                emailSender);

        Customer customer = new Customer("C001", "John Doe", "john.doe@example.com");
        Item item1 = new Item("I001", "Laptop", 1500.0);
        Item item2 = new Item("I002", "Mouse", 50.0);
        Order order = new Order("O001", Arrays.asList(item1, item2), customer);

        orderService.processOrder(order);
    }
}
