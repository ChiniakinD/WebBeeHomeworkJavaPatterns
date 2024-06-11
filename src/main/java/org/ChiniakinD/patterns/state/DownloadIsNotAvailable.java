package org.ChiniakinD.patterns.state;

public class DownloadIsNotAvailable implements FileState {

    @Override
    public String downloadFile() {
        return "Загрузка файла недоступна";
    }

}
