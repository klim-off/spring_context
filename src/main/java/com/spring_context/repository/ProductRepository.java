package com.spring_context.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;


@Component
public class ProductRepository {

    @Autowired
    private DataSource dataSource;

  /*  public ProductRepository(@Autowired DataSource dataSource) {
        this.dataSource = dataSource;
    }*/
}
