package org.ChiniakinD.patterns.state;

/**
 * Класс DownloadIsNotAvailable является состоянием, в котором файл недоступен для загрузки.
 * @author ChiniakinD
 */
public class DownloadIsNotAvailable implements FileState {

    /**
     * @return строка "Загрузка файла недоступна"
     */
    @Override
    public String downloadFile() {
        return "Загрузка файла недоступна";
    }

}
