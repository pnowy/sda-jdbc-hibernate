package com.github.pnowy.sda.db.jdbc;

import org.h2.jdbcx.JdbcDataSource;

import javax.sql.DataSource;


public class DataSourceExample {

    public static void main(String[] args) {
        JdbcDataSource dataSource = new JdbcDataSource();
        dataSource.setURL("");
        dataSource.setUser("");
        dataSource.setPassword("");

//        dataSource.getConnection()
    }

}
