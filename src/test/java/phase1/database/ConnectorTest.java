package phase1.database;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public final class ConnectorTest {
    @Test
    void jdbcUrlTargetsLocalPostgresOnPort5433() {
        assertTrue(
                Connector.JDBC_URL.startsWith("jdbc:postgresql://localhost:5433/"),
                "Expected the local PostgreSQL server on port 5433");
    }

    @Test
    void opensAValidPostgresConnection() throws SQLException {
        try (Connection connection = Connector.getConnection()) {
            assertTrue(connection.isValid(5), "PostgreSQL connection is not valid");
        }
    }
}