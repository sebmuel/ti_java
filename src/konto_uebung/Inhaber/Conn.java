package konto_uebung.Inhaber;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

abstract class Conn {
    protected static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/bankverwaltung";
    protected static final String DB_USERNAME = "seb";
    protected static final String DB_PASSWORD = "Hallodu123";
    protected static Connection connection;

    protected static void initConnection() throws SQLException{
        connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }
}
