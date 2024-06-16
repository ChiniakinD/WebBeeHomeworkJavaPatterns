package org.ChiniakinD.patterns.factory;

public class Word implements Document {

    /**
     * @return строку "Отправлен документ формата word"
     */
    @Override
    public String send() {

        return "Отправлен документ формата word";
    }

}
