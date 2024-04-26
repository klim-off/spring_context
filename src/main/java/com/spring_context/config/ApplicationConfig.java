package com.spring_context.config;

import com.spring_context.repository.UserRepository;
import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


import javax.sql.DataSource;

@Configuration
@ComponentScan(value = "com.spring_context")
public class ApplicationConfig {
    @Bean
    @Scope("singleton")
    public DataSource dataSource() {
        PGSimpleDataSource dataSource = new PGSimpleDataSource(); //1
        dataSource.setServerNames(new String[]{"localhost"});
        dataSource.setPortNumbers(new int[]{5432});
        dataSource.setDatabaseName("spring");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    /*@Bean
    @Scope("prototype")
    public UserRepository userRepository(){
        return new UserRepository(dataSource());
    }*/
}
