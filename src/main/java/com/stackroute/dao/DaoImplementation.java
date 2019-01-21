package com.stackroute.dao;

import com.stackroute.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DaoImplementation {

    public void InsertIntoCustomers(Customers customer){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/database1");
        driverManagerDataSource.setUsername("sairamsvn");
        driverManagerDataSource.setPassword("8985622271");
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(driverManagerDataSource);
        String sql = "insert into customers(userName,password) values(?,?)";
        jdbcTemplate.update(sql,new Object[]{customer.getUserName(),customer.getPassword()});
    }
}
