package org.ChiniakinD.patterns.visitor;

/**
 * Интерфейс ConnectionTypeVisitor определяет методы visit для каждого типа соединения.
 */
public interface ConnectionTypeVisitor {

    void visit(Bluetooth bluetooth);

    void visit(WiFi wiFi);

    void visit(Wire wire);

}
