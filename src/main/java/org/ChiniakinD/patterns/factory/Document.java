package org.ChiniakinD.patterns.factory;

/**
 * Реализации интерфейса Document могут быть различными типами документов.
 */
public interface Document {

    /**
     * Реализация этого метода зависит от конкретного типа документа.
     * @return строку об отправке документа конкректного формата.
     */
    String send();

}
