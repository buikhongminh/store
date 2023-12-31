package com.example.store.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Configuration
public class AppConfig {

    @Bean
    public DriverManagerDataSource dataSource() throws IOException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        Properties properties = new Properties();
        InputStream user_props = this.getClass()
                .getResourceAsStream("/application.properties");
        properties.load(user_props);
        dataSource.setDriverClassName(
                properties.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(properties.getProperty("spring.datasource.url"));
        dataSource.setUsername(
                properties.getProperty("spring.datasource.username"));
        dataSource.setPassword(
                properties.getProperty("spring.datasource.password"));
        return dataSource;
    }
}
