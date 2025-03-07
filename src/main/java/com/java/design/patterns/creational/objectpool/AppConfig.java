package com.java.design.patterns.creational.objectpool;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public DatabaseConnectionPool databaseConnectionPool() {
        return new DatabaseConnectionPool(10);
    }
}
