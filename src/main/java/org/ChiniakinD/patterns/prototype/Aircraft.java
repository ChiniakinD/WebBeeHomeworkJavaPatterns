package org.ChiniakinD.patterns.prototype;

import java.util.Objects;

/**
 * Класс Aircraft реализует паттерн prototype с помощью метода copy.
 * @author ChiniakinD
 */
public class Aircraft implements Copyable {

    private final String name;
    private final boolean presenceOfAutopilot;
    private final int speed;

    public Aircraft(String name, boolean presenceOfAutopilot, int speed) {
        this.name = name;
        this.presenceOfAutopilot = presenceOfAutopilot;
        this.speed = speed;
    }

    @Override
    public Aircraft copy() {
        return new Aircraft(name, presenceOfAutopilot, speed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (this.hashCode() != o.hashCode()) {
            return false;
        }
        Aircraft aircraft = (Aircraft) o;
        return presenceOfAutopilot == aircraft.presenceOfAutopilot && speed == aircraft.speed
                && Objects.equals(name, aircraft.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, presenceOfAutopilot, speed);
    }

}
