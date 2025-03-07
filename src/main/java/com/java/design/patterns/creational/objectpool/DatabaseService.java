package com.java.design.patterns.creational.objectpool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;

@Service
public class DatabaseService {
    @Autowired
    private DatabaseConnectionPool connectionPool;

    public void performDatabaseOperation() throws InterruptedException {
        try {
            DatabaseConnection conn = connectionPool.borrow();
            Connection connection = conn.getConnection();
            // perform database operation using the connection
            connectionPool.returnConnection(conn);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
