package org.ChiniakinD.patterns.facade;

public class ControlPower {

    /**
     * метод increasePower() увеличивает режим работы двигателя
     * @return сообщение "Режим работы двигателя увеличен"
     */
    public String increasePower() {
        return "Режим работы двигателя увеличен";
    }

    /**
     * метод decreasePower() уменьшает режим работы двигателя
     * @return сообщение "Режим работы двигателя уменьшен"
     */
    public String decreasePower() {
        return "Режим работы двигателя уменьшен";
    }

}

