package org.ChiniakinD.patterns.prototype;

/**
 * Классы, реализующие интерфейс Copyable, предоставляют реализацию метода создание копии. *
 * @author ChiniakinD
 */
public interface Copyable {

    /**
     * @return копия объекта.
     */
    Copyable copy();

}
