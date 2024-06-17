package org.ChiniakinD.patterns.chainOfResponsibility;

/**
 * Интерфейс Handler определяет метод обработки заказа и установки следующего обработчика.
 * @author Chiniakin Dmitrii
 */
public interface Handler {

    void setNextHandler(Handler nextHandler);

    String handle(String order);

}
