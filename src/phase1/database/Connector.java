package phase1.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    static final String JDBC_URL = "jdbc:postgresql://localhost:5433/sakila";
    static final String USER = "ECOAdmin";
    static final String PASSWORD = "F22R@ptor";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }
}
