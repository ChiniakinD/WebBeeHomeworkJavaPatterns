package org.ChiniakinD;

import org.ChiniakinD.patterns.prototype.Aircraft;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class TestPrototype {

    @Test
    public void compareEqualsShouldReturnTrue() {
        Aircraft aircraft = new Aircraft("Boeing",true,600);
        Aircraft aircraftCopy = aircraft.copy();
        assertEquals(aircraft,aircraftCopy);
    }

    @Test
    public void aircraftWithCopyAircraftShouldBeNotSame() {
        Aircraft aircraft = new Aircraft("Boeing",true,600);
        Aircraft aircraftCopy = aircraft.copy();
        assertNotSame(aircraft,aircraftCopy);
    }

}
