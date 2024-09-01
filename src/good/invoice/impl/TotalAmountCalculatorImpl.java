package good.invoice.impl;

import good.InvoiceContext;
import good.invoice.TotalAmountCalculator;

public class TotalAmountCalculatorImpl implements TotalAmountCalculator {

    @Override
    public void calculateTotalAmount(InvoiceContext context) {
        System.out.println("Toplam tutarı hesapla");
    }
    
}