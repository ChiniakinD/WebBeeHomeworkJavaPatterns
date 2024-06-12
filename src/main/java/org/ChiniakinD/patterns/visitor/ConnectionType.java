package org.ChiniakinD.patterns.visitor;

/**
 * Интерфейс ConnectionType определяет метод accept для visitor.
 */
public interface ConnectionType {

    void accept(ConnectionTypeVisitor connectionTypeVisitor);

}
