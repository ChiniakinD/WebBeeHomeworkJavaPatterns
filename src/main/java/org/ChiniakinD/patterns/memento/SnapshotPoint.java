package org.ChiniakinD.patterns.memento;

/**
 * Класс SnapshotPoint представляет сохраненное состояние Point
 * @author Chiniakin Dmitrii
 */
public class SnapshotPoint {

    private int[] state = new int[2];

    /**
     * Метод convertStateToPoint() преобразует сохраненное состояние в объект Point
     * @return объект Point с сохраненными координатами
     */
    public Point convertStateToPoint() {
        return new Point(state[0], state[1]);
    }

    /**
     * Метод getStateFromPoint() сохраняет состояние объекта point
     * @param point объект point из которого сохраняется состояние
     */
    public void getStateFromPoint(Point point) {
        this.state[0] = point.getX();
        this.state[1] = point.getY();
    }

}
