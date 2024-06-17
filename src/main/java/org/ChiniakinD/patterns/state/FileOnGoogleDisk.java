package org.ChiniakinD.patterns.state;

/**
 * Класс FileOnGoogleDisk обладает возможностью изменения состояния доступности для загрузки.
 * Состояние доступности файла управляется через объекты типа FileState.
 * Данный функционал реализуется при помощи паттерна state.
 * @author ChiniakinD
 */
public class FileOnGoogleDisk {

    private FileState fileState;

    public FileOnGoogleDisk(FileState fileState) {
        this.fileState = fileState;
    }

    /**
     * Устанавливает новое состояние доступности файла.
     * @param fileState новое состояние доступности файла
     */
    public void setFileState(FileState fileState) {
        this.fileState = fileState;
    }

    /**
     * @return строка о текущем состоянии доступности файла
     */
    public String download() {
        return fileState.downloadFile();
    }

}
