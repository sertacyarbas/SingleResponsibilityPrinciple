package good.invoice;

import good.InvoiceContext;

public interface OrderValidator {
    void validateOrders(InvoiceContext context);
}