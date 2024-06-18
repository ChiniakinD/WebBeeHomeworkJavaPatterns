package org.ChiniakinD.visitor;

import org.ChiniakinD.patterns.visitor.*;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class TestVisitor {

    @Mock
    private Logger logger;
    private Visitor visitor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        visitor = new Visitor(logger);
    }


    @Test
    void visitBluetoothShouldContainCorrectLog() {
        ConnectionType bluetooth = new Bluetooth();
        bluetooth.accept(visitor);
        verify(logger).info("Соединение через bluetooth");
    }

    @Test
    void visitWiFiShouldContainCorrectLog() {
       WiFi wiFi = new WiFi();
       wiFi.accept(visitor);
       verify(logger).info("Соединение через wifi");
    }

    @Test
    void visitWireShouldContainCorrectLog() {
        Wire wire = new Wire();
        wire.accept(visitor);
        verify(logger).info("Проводное соединение");
    }
}
