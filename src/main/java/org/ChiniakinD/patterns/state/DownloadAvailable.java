package org.ChiniakinD.patterns.state;

public class DownloadAvailable implements FileState {

    @Override
    public String downloadFile() {
        return "Файл загружен";
    }

}
