package org.ChiniakinD.patterns.strategy;

public class PayByPhone implements PayPurchase {

    @Override
    public String pay() {
        return "Оплата телефоном";
    }

}
