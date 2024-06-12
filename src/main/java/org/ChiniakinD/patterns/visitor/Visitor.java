package org.ChiniakinD.patterns.visitor;

/**
 * Класс Visitor реализует методы visit интерфейса ConnectionTypeVisitor.
 *
 * @author Chiniakin Dmitrii
 */
public class Visitor implements ConnectionTypeVisitor {

    /**
     * @param bluetooth объект Bluetooth
     */
    @Override
    public void visit(Bluetooth bluetooth) {
        System.out.println("Соединение через bluetooth");
    }

    /**
     * @param wiFi объект WiFi
     */
    @Override
    public void visit(WiFi wiFi) {
        System.out.println("Соединение через wifi");
    }

    /**
     * @param wire объект Wire
     */
    @Override
    public void visit(Wire wire) {
        System.out.println("Проводное соединение");
    }

}
