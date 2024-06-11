package org.ChiniakinD.patterns.factory;

public class PDF implements Document {

    /**
     * @return строку "Отправлен документ формата pdf"
     */
    @Override
    public String send() {
        return "Отправлен документ формата pdf";
    }

}
