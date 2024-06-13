package org.ChiniakinD.patterns.chainOfResponsibility;

/**
 * Класс MobilePhoneStore реализует обработчик заказов на мобильные телефонов.
 * @author Chiniakin Dmitrii
 */
public class MobilePhoneStore implements Handler {

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
        if (order.equals("Мобильный телефон")) {
            return "Заказ обработан складом мобильных телефонов";
        } else if (nextHandler != null) {
            return nextHandler.handle(order);
        } else {
            return "Заказ не может быть обработан";
        }
    }

}
