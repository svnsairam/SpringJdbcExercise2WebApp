package com.stackroute.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.stackroute")
public class WebAppConfig {
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp's/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

//    @Bean(name = "dataSourceBean")
//    public DriverManagerDataSource driverManagerDataSourceBean(){
//        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/database1");
//        driverManagerDataSource.setUsername("sairamsvn");
//        driverManagerDataSource.setPassword("8985622271");
//        return driverManagerDataSource;
//    }
//
//
//    @Bean(name = "jdbcTempletBean")
//    public JdbcTemplate jdbcTemplateBean(){
//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//        jdbcTemplate.setDataSource(driverManagerDataSourceBean());
//        return jdbcTemplate;
//    }

}
