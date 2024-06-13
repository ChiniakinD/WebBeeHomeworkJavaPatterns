package org.ChiniakinD.chainOfResponsibility;

import org.ChiniakinD.patterns.chainOfResponsibility.LaptopStore;
import org.ChiniakinD.patterns.chainOfResponsibility.MobilePhoneStore;
import org.ChiniakinD.patterns.chainOfResponsibility.PCStore;
import org.ChiniakinD.patterns.chainOfResponsibility.Shop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestChainOfResponsibility {

    private Shop shop;
    private LaptopStore laptopStore;
    private MobilePhoneStore mobilePhoneStore;
    private PCStore pcStore;

    @BeforeEach
    public void setUp() {
        laptopStore = new LaptopStore();
        shop = new Shop(laptopStore);
        mobilePhoneStore = new MobilePhoneStore();
        pcStore = new PCStore();
        laptopStore.setNextHandler(mobilePhoneStore);
        mobilePhoneStore.setNextHandler(pcStore);
    }

    @Test
    void orderLaptopShouldHandleLaptopStore() {
        assertEquals("Заказ обработан складом ноутбуков", shop.handleOrder("Ноутбук"));
    }

    @Test
    void orderMobilePhoneShouldHandleMobilePhoneStore() {
        assertEquals("Заказ обработан складом мобильных телефонов", shop.handleOrder("Мобильный телефон"));
    }

    @Test
    void orderPcShouldHandlePcStore() {
        assertEquals("Заказ обработан складом персональных компьютеров", shop.handleOrder("Персональный компьютер"));
    }

    @Test
    void incorrectOrderShouldReturnInformString() {
        assertEquals("Заказ не может быть обработан", shop.handleOrder("Самокат"));
    }

}
