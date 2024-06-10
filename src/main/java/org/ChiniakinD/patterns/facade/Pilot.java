package org.ChiniakinD.patterns.facade;

public class Pilot {

    private final Autopilot autopilot;

    public Pilot() {
        autopilot = new Autopilot();
    }

    public String useAutopilotForTakeoff() {
        return autopilot.takeOff();
    }

    public String useAutopilotForLanding() {
        return autopilot.land();
    }

}
