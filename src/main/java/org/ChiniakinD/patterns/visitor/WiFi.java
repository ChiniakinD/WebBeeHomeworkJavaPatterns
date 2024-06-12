package org.ChiniakinD.patterns.visitor;

/**
 * Класс WiFi реализует метод accept() интерфейса ConnectionType для принятия визитера.
 * @author Chiniakin Dmitrii
 */
public class WiFi implements ConnectionType {

    @Override
    public void accept(ConnectionTypeVisitor connectionTypeVisitor) {
        connectionTypeVisitor.visit(this);
    }

}
