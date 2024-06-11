package org.ChiniakinD.patterns.factory;

public class Text implements Document {

    /**
     * @return строку "Отправлен документ формата text"
     */
    @Override
    public String send() {

        return "Отправлен документ формата text";
    }

}
