package org.ChiniakinD.patterns.factory;

public class Text implements Document {

    @Override
    public String send() {

        return "Отправлен документ формата text";
    }

}
