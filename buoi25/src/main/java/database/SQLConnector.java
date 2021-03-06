package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnector {
    private static final String URL = "jdbc:mysql://localhost:3306";

    public static Connection connect(String database, String username, String password) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dUrl = String.format("%s/%s?characterEncoding=UTF-8", URL, database);
        return DriverManager.getConnection(dUrl, username, password);
    }
}
