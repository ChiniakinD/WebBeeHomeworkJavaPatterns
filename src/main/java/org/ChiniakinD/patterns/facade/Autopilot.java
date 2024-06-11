package org.ChiniakinD.patterns.facade;

/**
 * Класс Autopilot является реализацией паттерна facade.
 * Он упрощает взаимодействие класса Pilot с различными системами самолета.
 * Для взлета и посадки используются соответственно методы takeoff() и land().
 * @author Chiniakin Dmitrii
 */
public class Autopilot {

    private final ControlGears controlGears;
    private final ControlFlaps controlFlaps;
    private final ControlPower controlPower;

    /**
     * Конструктор класса Autopilot инициализирует объекты для управления системами самолета.
     */
    public Autopilot() {
        this.controlGears = new ControlGears();
        this.controlFlaps = new ControlFlaps();
        this.controlPower = new ControlPower();
    }

    /**
     * Метод takeOff() выполняет последовательность действий для взлета.
     * @return строку с результатами действий при взлете.
     */
    public String takeOff() {
        return controlGears.gearsUp() + "\n" + controlFlaps.retractFlaps() +
                "\n" + controlPower.increasePower();
    }

    /**
     * Метод land() выполняет последовательность действий для посадки.
     * @return строку с результатами действий при посадке.
     */
    public String land() {
        return controlGears.gearsDown() + "\n" + controlFlaps.extractFlaps() +
                "\n" + controlPower.decreasePower();
    }

}
