package org.ChiniakinD.patterns.memento;

/**
 * Класс Point представляет точку на координатной плоскости.
 * @author Chiniakin Dmitrii
 */
public class Point {

    /**
     * Конструктор для создания точки с заданными координатами.
     * @param x координата x
     * @param y координата y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
