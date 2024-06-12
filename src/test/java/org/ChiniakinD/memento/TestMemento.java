package org.ChiniakinD.memento;

import org.ChiniakinD.patterns.memento.Point;
import org.ChiniakinD.patterns.memento.PointStore;
import org.ChiniakinD.patterns.memento.SnapshotPoint;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMemento {

    private SnapshotPoint snapshotPoint;
    private PointStore pointStore;
    private Point point;

    @BeforeEach
    public void before() {
        snapshotPoint = new SnapshotPoint();
        pointStore = new PointStore();
        point = new Point(5, 5);
    }

    @Test
    public void snapshotShouldReturnSameConditionPoint() {
        snapshotPoint.getStateFromPoint(point);
        pointStore.addPointSnapshot(snapshotPoint);
        point.setX(10);
        point.setY(10);
        snapshotPoint = pointStore.getStatePoint(0);
        point = snapshotPoint.convertStateToPoint();
        assertEquals(5, point.getX());
        assertEquals(5, point.getY());
    }

}
