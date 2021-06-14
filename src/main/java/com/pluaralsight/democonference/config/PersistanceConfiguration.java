package com.pluaralsight.democonference.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistanceConfiguration {
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/conference_app");
        // TODO; put username ans password in a secure place
        builder.username("postgres");
        builder.password("Welcome");
        System.out.println("My custom datasource bean has been initalized and set");
        return builder.build();

    }
}


