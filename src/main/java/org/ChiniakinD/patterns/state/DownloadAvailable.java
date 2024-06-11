package org.ChiniakinD.patterns.state;

/**
 * Класс DownloadAvailable является состоянием, в котором файл доступен для загрузки.
 * @author ChiniakinD
 */
public class DownloadAvailable implements FileState {

    /**
     * @return строка "Файл загружен"
     */
    @Override
    public String downloadFile() {
        return "Файл загружен";
    }

}
