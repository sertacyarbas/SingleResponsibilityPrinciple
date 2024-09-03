package bad;

import java.util.Arrays;

import bad.service.OrderService;
import model.Customer;
import model.Item;
import model.Order;

public class Application {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        Customer customer = new Customer("C001", "John Doe", "john.doe@example.com");
        Item item1 = new Item("I001", "Laptop", 1500.0);
        Item item2 = new Item("I002", "Mouse", 50.0);
        Order order = new Order("O001", Arrays.asList(item1, item2), customer);

        orderService.processOrder(order);
    }
}