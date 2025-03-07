package com.java.design.patterns.creational.objectpool;

import lombok.Getter;

import java.sql.Connection;

@Getter
public class DatabaseConnection {
    private final String connectionName;
    private final Connection connection;
    private boolean isActive;

    public DatabaseConnection(String connectionName, Connection connection, boolean isActive) {
        this.connectionName = connectionName;
        this.connection = connection;
        this.isActive = false;
    }

    public void connect(){
        if(!isActive){
            this.isActive = true;
        }
    }

    public void disconnect() {
        if(isActive){
            this.isActive = false;
        }

    }
}
