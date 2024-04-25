package com.spring_context.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import javax.sql.DataSource;

@Configuration
public class ApplicationConfig
{
    @Bean
    public DataSource dataSource(){

    }
}
