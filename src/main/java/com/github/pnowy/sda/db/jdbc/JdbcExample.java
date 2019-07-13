package com.github.pnowy.sda.db.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcExample {

    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String JDBC_URL = "jdbc:h2:./database/test";

    private static final String USERNAME = "sa";
    private static final String PASSWORD = "";

    public static void main(String[] args) throws Exception {
        Class.forName(JDBC_DRIVER);

        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement()) {

            statement.executeUpdate("CREATE TABLE USER (id INTEGER, age integer)");
            statement.executeUpdate("");
        }


//        statement.close();
//        connection.close();
    }

}
