package good.invoice;

import good.InvoiceContext;

public interface TotalAmountCalculator {
    void calculateTotalAmount(InvoiceContext context);
}