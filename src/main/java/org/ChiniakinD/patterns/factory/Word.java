package org.ChiniakinD.patterns.factory;

public class Word implements Document {

    @Override
    public String send() {

        return "Отправлен документ формата word";
    }

}
