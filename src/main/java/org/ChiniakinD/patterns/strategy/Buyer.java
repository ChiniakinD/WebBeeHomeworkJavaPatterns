package org.ChiniakinD.patterns.strategy;

/**
 * Класс Buyer является покупателем, который может оплачивать покупки различными способами.
 * Этот класс использует паттерн strategy.
 * @author Chiniakin Dmitrii
 */
public class Buyer {

    private PayPurchase payPurchase;

    public Buyer(PayPurchase payPurchase) {
        this.payPurchase = payPurchase;
    }

    public String pay() {
        return payPurchase.pay();
    }

}
