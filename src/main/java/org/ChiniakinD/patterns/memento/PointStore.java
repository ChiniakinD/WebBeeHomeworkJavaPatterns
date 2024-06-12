package org.ChiniakinD.patterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс PointStore хранилищем сохраненных состояний точек
 * @author Chiniakin Dmitrii
 */
public class PointStore {

    private final List<SnapshotPoint> snapshotPoints = new ArrayList<>();

    /**
     * Метод addPointSnapshot() добавляет состояние точки в хранилище
     * @param snapshotPoint состояние точки для добавления
     */
    public void addPointSnapshot(SnapshotPoint snapshotPoint) {
        snapshotPoints.add(snapshotPoint);
    }

    /**
     * Метод getStatePoint() получает сохраненное состояние точки по индексу
     * @param index индекс состояния в списке
     * @return сохраненное состояние точки
     */
    public SnapshotPoint getStatePoint(int index) {
        return snapshotPoints.get(index);
    }

}

