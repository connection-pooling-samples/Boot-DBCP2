package com.rudra.aks.dbcp2;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DBCPApp {

	public static void main(String[] args) {
		SpringApplication.run(DBCPApp.class, args);
	}

	@Autowired
	DataSource	dataSource;
	
	@Bean
	public	JdbcTemplate	jdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}
}
