package org.ChiniakinD.patterns.chainOfResponsibility;

/**
 * Класс LaptopStore реализует обработчик заказов на ноутбуки.
 * @author Chiniakin Dmitrii
 */
public class LaptopStore implements Handler {

    private Handler nextHandler;

    /**
     * @param nextHandler следующий обработчик в цепочке.
     */
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * @param order заказ на обработку
     * @return результат обработки заказа
     */
    @Override
    public String handle(String order) {
        if (order.equals("Ноутбук")) {
            return "Заказ обработан складом ноутбуков";
        } else if (nextHandler != null) {
            return nextHandler.handle(order);
        } else {
            return "Заказ не может быть обработан";
        }
    }

}
