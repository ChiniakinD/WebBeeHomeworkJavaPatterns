package org.ChiniakinD;

import org.ChiniakinD.patterns.state.DownloadAvailable;
import org.ChiniakinD.patterns.state.DownloadIsNotAvailable;
import org.ChiniakinD.patterns.state.FileOnGoogleDisk;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFileOnGoogleDisk {

    @Test
    public void shouldReturnDownloadedWhenAvailable() {
        FileOnGoogleDisk fileOnGoogleDisk = new FileOnGoogleDisk(new DownloadAvailable());
        assertEquals("Файл загружен", fileOnGoogleDisk.download());
    }

    @Test
    public void shouldReturnNotAvailableMessageWhenNotAvailable() {
        FileOnGoogleDisk fileOnGoogleDisk = new FileOnGoogleDisk(new DownloadIsNotAvailable());
        assertEquals("Загрузка файла недоступна", fileOnGoogleDisk.download());
    }

    @Test
    public void shouldReturnNotAvailableAfterStateChange() {
        FileOnGoogleDisk fileOnGoogleDisk = new FileOnGoogleDisk(new DownloadAvailable());
        fileOnGoogleDisk.setFileState(new DownloadIsNotAvailable());
        assertEquals("Загрузка файла недоступна", fileOnGoogleDisk.download());
    }

    @Test
    public void shouldReturnDownloadedAfterStateChange() {
        FileOnGoogleDisk fileOnGoogleDisk = new FileOnGoogleDisk(new DownloadIsNotAvailable());
        fileOnGoogleDisk.setFileState(new DownloadAvailable());
        assertEquals("Файл загружен", fileOnGoogleDisk.download());
    }

}
