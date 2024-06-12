package org.ChiniakinD.visitor;

import org.ChiniakinD.patterns.visitor.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVisitor {

    private Visitor visitor;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        visitor = new Visitor();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    void visitBluetoothShouldReturnCorrectString() {
        ConnectionType bluetooth = new Bluetooth();
        bluetooth.accept(visitor);
        assertEquals("Соединение через bluetooth\n", outContent.toString());
    }

    @Test
    void visitWiFiShouldReturnCorrectString() {
       WiFi wiFi = new WiFi();
       wiFi.accept(visitor);
       assertEquals("Соединение через wifi\n", outContent.toString());
    }

    @Test
    void visitWireShouldReturnCorrectString() {
        Wire wire = new Wire();
        wire.accept(visitor);
        assertEquals("Проводное соединение\n", outContent.toString());
    }
}
