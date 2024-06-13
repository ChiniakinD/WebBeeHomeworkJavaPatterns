package org.ChiniakinD.patterns.chainOfResponsibility;

/**
 * Класс PCStore реализует обработчик заказов на персональные компьютеры.
 * @author Chiniakin Dmitrii
 */
public class PCStore implements Handler {

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
    public String handle(String order) {
        if (order.equals("Персональный компьютер")) {
            return "Заказ обработан складом персональных компьютеров";
        } else if (nextHandler != null) {
            return nextHandler.handle(order);
        } else {
            return "Заказ не может быть обработан";
        }
    }

}
