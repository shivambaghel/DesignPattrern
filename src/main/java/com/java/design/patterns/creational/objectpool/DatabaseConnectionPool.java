package com.java.design.patterns.creational.objectpool;

import org.springframework.boot.jdbc.metadata.HikariDataSourcePoolMetadata;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class DatabaseConnectionPool {
    private BlockingDeque<DatabaseConnection> pool;
    private int maxPoolSize;
    private DataSource dataSource;

    public DatabaseConnectionPool(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
        this.pool = new LinkedBlockingDeque<>(maxPoolSize);
        initializeDataSource();
        initializePool();
    }

    private void initializePool() {
        for(int i=0; i<maxPoolSize; i++) {
            try{
                Connection mysqlConnection = dataSource.getConnection();
                pool.add(new DatabaseConnection("mysql", mysqlConnection, true));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void initializeDataSource() {
//        HikariConfig config = new HikariConfig();
//        config.setJDBCUrl("");
//        config.setUsername("");
//        config.setPassword("");
//        config.maximumPoolSize(maxPoolSize);
//        this.dataSource = new HikariDataSource(config);
    }

    public DatabaseConnection borrow() throws InterruptedException {
        DatabaseConnection conn = pool.take();
        conn.connect();
        return conn;
    }

    public void returnConnection(DatabaseConnection conn) {
        conn.disconnect();
        pool.add(conn);
    }
}
