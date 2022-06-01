package konto.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class conn {
    protected static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/bankverwaltung?";
    protected static final String DB_USERNAME = "seb";
    protected static final String DB_PASSWORD = "Hallodu123";
    protected static Connection conn;

    protected static void initConnection() throws SQLException {
        conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }
}
