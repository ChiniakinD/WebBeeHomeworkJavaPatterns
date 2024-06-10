package org.ChiniakinD.patterns.facade;

/**
 * Класс Autopilot является реализацией паттерна facade.
 * Он упрощает взаимодействие класса Pilot с различными системами самолета.
 * @author ChiniakinDmitrii
 */
public class Autopilot {

    private final ControlGears controlGears;
    private final ControlFlaps controlFlaps;
    private final ControlPower controlPower;

    public Autopilot() {
        this.controlGears = new ControlGears();
        this.controlFlaps = new ControlFlaps();
        this.controlPower = new ControlPower();
    }

    public String takeOff() {
        return controlGears.gearsUp() + "\n" + controlFlaps.retractFlaps() +
                "\n" + controlPower.increasePower();
    }

    public String land() {
        return controlGears.gearsDown() + "\n" + controlFlaps.extractFlaps() +
                "\n" + controlPower.decreasePower();
    }

}
