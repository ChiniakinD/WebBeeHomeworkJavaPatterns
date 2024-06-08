package org.ChiniakinD.patterns.singleton;

/**
 * Класс DatabaseConnectionPool реализует паттерн singleton.
 * @author Chiniakin Dmitrii
 */
public final class DatabaseConnectionPool {

    private static DatabaseConnectionPool instance;
    private final String dBURL;
    private final String dBUSERNAME;
    private final String dBPASSWORD;

    private DatabaseConnectionPool() {
        dBURL = "jdbc:database://localhost:40001/bank-account";
        dBUSERNAME = "database";
        dBPASSWORD = "admin";
    }

    public static DatabaseConnectionPool getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionPool();
        }
        return instance;
    }

    public String getPassword() {
        return dBPASSWORD;
    }

}
