package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

@Configuration
public class ConfiguracaoDb {
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://mysql.infocimol.com.br:3306/infocimol24");
        dataSource.setUsername("infocimol24");
        dataSource.setPassword("SportsMatch2408");
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter adapater = new HibernateJpaVendorAdapter();
        adapater.setDatabase(Database.MYSQL);
        adapater.setShowSql(true);
        adapater.setGenerateDdl(true);
        adapater.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
        adapater.setPrepareConnection(true);
        return adapater;
    }
}