package org.ChiniakinD.patterns.facade;

public class ControlGears {

    /**
     * метод gearsUp() убирает шасси самолета
     * @return сообщение "Шасси убраны"
     */
    public String gearsUp() {
        return "Шасси убраны";
    }

    /**
     * метод gearsDown() выпускает шасси самолета
     * @return сообщение "Шасси выпущены"
     */
    public String gearsDown() {
        return "Шасси выпущены";
    }

}
