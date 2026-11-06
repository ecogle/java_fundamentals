package phase1.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class Demo {

    public static Connection conn;

    static {
        try {
            conn = Connector.getConnection();
        } catch (SQLException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static List<String> listActors() {

        Statement stmt;
        List<String> list = new LinkedList<>();
        try {
            stmt = conn.createStatement();
            stmt.execute("select actor_id, concat(first_name, ' ', last_name) name from public.actor");
            var result = stmt.getResultSet();

            while (result.next()) {
                list.add(result.getString("name"));
            }
        } catch (SQLException e) {

        }
        return list;
    }
}
