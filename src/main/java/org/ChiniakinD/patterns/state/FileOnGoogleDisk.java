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

    public void setFileState(FileState fileState) {
        this.fileState = fileState;
    }

    public String download() {
        return fileState.downloadFile();
    }

}
