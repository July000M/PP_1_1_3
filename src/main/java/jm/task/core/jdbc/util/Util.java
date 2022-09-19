package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String HOST = "jdbc:mysql://localhost:3306/test";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private Util() {
        throw new IllegalStateException("Utility class");
    }


    public static Connection getConnection() {
        Connection connection = null;


        try {
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);

        } catch (SQLException e) {
            System.out.println("Ошибка в getConnection");
            e.printStackTrace();
        }
        return connection;
    }

}
