package org.ChiniakinD.patterns.visitor;

import org.apache.logging.log4j.Logger;

/**
 * Класс Visitor реализует методы visit интерфейса ConnectionTypeVisitor.
 *
 * @author Chiniakin Dmitrii
 */
public class Visitor implements ConnectionTypeVisitor {

    private final Logger logger;

    public Visitor(Logger logger) {
        this.logger = logger;
    }

    /**
     * @param bluetooth объект Bluetooth
     */
    @Override
    public void visit(Bluetooth bluetooth) {
        logger.info("Соединение через bluetooth");
    }

    /**
     * @param wiFi объект WiFi
     */
    @Override
    public void visit(WiFi wiFi) {
        logger.info("Соединение через wifi");
    }

    /**
     * @param wire объект Wire
     */
    @Override
    public void visit(Wire wire) {
        logger.info("Проводное соединение");
    }

}
