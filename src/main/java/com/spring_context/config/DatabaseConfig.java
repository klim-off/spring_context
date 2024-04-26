/*

package com.spring_context.config;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public enum DatabaseConfig {
    INSTANCE;

    private DataSource dataSource;

    public DataSource getDataSource() {
        if (dataSource == null){
            PGSimpleDataSource dataSource = new PGSimpleDataSource(); //1
            dataSource.setServerNames(new String[]{"localhost"});
            dataSource.setPortNumbers(new int[]{5432});
            dataSource.setDatabaseName("spring");
            dataSource.setUser("root");
            dataSource.setPassword("root");
            this.dataSource = dataSource;
        }
        return dataSource;
    }
}

*/
