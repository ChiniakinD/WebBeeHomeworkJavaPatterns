package org.ChiniakinD.singleton;

import org.ChiniakinD.patterns.singleton.DatabaseConnectionPool;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class TestDataBaseConnectionPool {

    @Test
    void singleDataBaseConnectionPool() {
        DatabaseConnectionPool instance1 = DatabaseConnectionPool.getInstance();
        DatabaseConnectionPool instance2 = DatabaseConnectionPool.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void expectedPassword() {
        DatabaseConnectionPool instance1 = DatabaseConnectionPool.getInstance();
        assertEquals(instance1.getPassword(), "admin");
    }
}
