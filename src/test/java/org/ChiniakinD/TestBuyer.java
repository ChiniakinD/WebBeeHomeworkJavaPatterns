package org.ChiniakinD;

import org.ChiniakinD.patterns.strategy.Buyer;
import org.ChiniakinD.patterns.strategy.PayByCard;
import org.ChiniakinD.patterns.strategy.PayByCash;
import org.ChiniakinD.patterns.strategy.PayByPhone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBuyer {

    @Test
    void testPayByCardIsCorrect() {
        Buyer buyer = new Buyer(new PayByCard());
        assertEquals("Оплата картой", buyer.pay());
    }

    @Test
    void testPayByPhoneIsCorrect() {
        Buyer buyer = new Buyer(new PayByPhone());
        assertEquals("Оплата телефоном", buyer.pay());
    }

    @Test
    void testPayByCashIsCorrect() {
        Buyer buyer = new Buyer(new PayByCash());
        assertEquals("Оплата наличными", buyer.pay());
    }
}
