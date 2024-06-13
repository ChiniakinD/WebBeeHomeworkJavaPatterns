package org.ChiniakinD.patterns.strategy;

public class PayByCash implements PayPurchase {

    @Override
    public String pay() {
        return "Оплата наличными";
    }
    }

