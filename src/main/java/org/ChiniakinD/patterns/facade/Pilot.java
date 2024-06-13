package org.ChiniakinD.patterns.facade;

/**
 * Класс Pilot позволяет использовать автопилот для взлета и посадки.
 * @author Chiniakin Dmitrii
 */
public class Pilot {

    private final Autopilot autopilot;

    public Pilot() {
        autopilot = new Autopilot();
    }

    /**
     * Метод useAutopilotForTakeoff() использует автопилот для взлета.
     * @see Autopilot#takeOff()
     * @return строку с результатом действий для взлета.
     */
    public String useAutopilotForTakeoff() {
        return autopilot.takeOff();
    }

    /**
     * Метод useAutopilotForLanding() использует автопилот для посадки.
     * @see Autopilot#land()
     * @return строку с результатом действий для посадки.
     */
    public String useAutopilotForLanding() {
        return autopilot.land();
    }

}
