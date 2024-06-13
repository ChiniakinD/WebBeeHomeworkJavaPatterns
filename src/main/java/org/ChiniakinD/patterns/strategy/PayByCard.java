package org.ChiniakinD.patterns.strategy;

public class PayByCard implements PayPurchase {

    @Override
    public String pay() {
        return "Оплата картой";
    }

}
