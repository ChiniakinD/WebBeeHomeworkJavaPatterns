package org.ChiniakinD.patterns.visitor;

/**
 * Класс Bluetooth реализует метод accept() интерфейса ConnectionType для принятия визитера.
 * @author Chiniakin Dmitrii
 */
public class Bluetooth implements ConnectionType {

    @Override
    public void accept(ConnectionTypeVisitor connectionTypeVisitor) {
        connectionTypeVisitor.visit(this);
    }

}
