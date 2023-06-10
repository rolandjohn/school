package com.simplex.school.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DbConfig {

    @ConfigurationProperties(prefix = "spring.datasource.school")
    @Bean(name = "schoolDataSource")
    @Qualifier("schoolDataSource")
    public DataSource paymentHubDataSource() {
        return DataSourceBuilder.create().build();
    }
}
