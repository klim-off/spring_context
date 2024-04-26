package com.spring_context.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@RequiredArgsConstructor
public class EmployeeRepository {

    private final DataSource dataSource;
}
