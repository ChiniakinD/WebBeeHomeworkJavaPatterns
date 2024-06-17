package org.ChiniakinD.patterns.chainOfResponsibility;

/**
 * Класс Shop представляет собой магазин, который обрабатывает заказы,
 * используя цепочку обработчиков.
 * @author Chiniakin Dmitrii
 */
public class Shop {

    private final LaptopStore laptopStore;

    public Shop(LaptopStore laptopStore) {
        this.laptopStore = laptopStore;
    }

    public String handleOrder(String order) {
        return laptopStore.handle(order);
    }

}
