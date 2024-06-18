package org.ChiniakinD.patterns.visitor;

/**
 * Класс Wire реализует метод accept() интерфейса ConnectionType для принятия визитера.
 * @author Chiniakin Dmitrii
 */
public class Wire implements ConnectionType {

    @Override
    public void accept(ConnectionTypeVisitor connectionTypeVisitor) {
        connectionTypeVisitor.visit(this);
    }

}
