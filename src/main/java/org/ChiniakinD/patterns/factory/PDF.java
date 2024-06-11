package org.ChiniakinD.patterns.factory;

public class PDF implements Document {

    @Override
    public String send() {

        return "Отправлен документ формата pdf";
    }

}
