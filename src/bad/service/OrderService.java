package bad.service;

import model.Item;
import model.Order;

public class OrderService {
    public void processOrder(Order order) {
        // 1. Siparişin geçerliliğini kontrol et
        if (order == null || !order.isValid()) {
            throw new IllegalArgumentException("Geçersiz sipariş.");
        }

        // 2. Stokta yeterli ürün olup olmadığını kontrol et
        if (!checkStock(order)) {
            return;
        }

        // 3. Sipariş tutarını hesapla
        double totalAmount = calculateTotalAmount(order);
        order.setTotalAmount(totalAmount);
        System.out.println("Hesaplanan toplam tutar: " + totalAmount);

        // 4. Siparişi veritabanına kaydet
        saveOrderToDatabase(order);

        // 5. Müşteriye sipariş onay e-postası gönder
        sendOrderConfirmationEmail(order);
    }

    private boolean checkStock(Order order) {
        // Veritabanından stok kontrolü işlemi
        System.out.println("Sipariş için stok kontrolü: " + order.getId());
        return true;
    }

    private double calculateTotalAmount(Order order) {
        // Siparişin toplam tutarını hesaplama
        return order.getItems().stream().mapToDouble(Item::getPrice).sum();
    }

    private void saveOrderToDatabase(Order order) {
        // Siparişi veritabanına kaydetme işlemi
        System.out.println("Sipariş veritabanına kaydedildi. ID:" + order.getId());
    }

    private void sendOrderConfirmationEmail(Order order) {
        // Müşteriye sipariş onay e-postası gönderme işlemi
        System.out.println("Sipariş onay e-postası şu adrese gönderildi: " + order.getCustomerEmail());
    }
}