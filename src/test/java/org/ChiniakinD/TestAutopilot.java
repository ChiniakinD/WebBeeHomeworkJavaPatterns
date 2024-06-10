package org.ChiniakinD;

import org.ChiniakinD.patterns.facade.Pilot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAutopilot {

    private Pilot pilot;

    @BeforeEach
    void setUp() {
        pilot = new Pilot();
    }

    @Test
    void useAutopilotForTakeoffReturnCorrectSequence() {
        String expectedWorkOnTakeOff = "Шасси убраны\nЗакрылки убраны\nРежим работы двигателя увеличен";
        assertEquals(expectedWorkOnTakeOff, pilot.useAutopilotForTakeoff());
    }
    @Test
    void useAutopilotForLandingReturnCorrectSequence() {
        String expectedWorkOnLanding = "Шасси выпущены\nЗакрылки выпущены\nРежим работы двигателя уменьшен";
        assertEquals(expectedWorkOnLanding, pilot.useAutopilotForLanding());
    }

}
