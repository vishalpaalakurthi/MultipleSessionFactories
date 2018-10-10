package com.example.demo;

import Util.HibernateUtil;
import com.example.demo.Service.DataService;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.util.Properties;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext c= SpringApplication.run(DemoApplication.class, args);
		DataService d = c.getBean(DataService.class);
		d.getDataFrom();
	}

	@Bean
	public SessionFactory s1(){
		SessionFactory s = null;
		try {
			Configuration configuration = new Configuration();
			configuration.setProperty("connection.driver_class","com.mysql.jdbc.Driver");
			configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/xxxx");
			configuration.setProperty("hibernate.connection.username", "username");
			configuration.setProperty("hibernate.connection.password", "password");
			configuration.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
			configuration.setProperty("hibernate.hbm2ddl.auto", "none");
			configuration.setProperty("show_sql", "true");
			configuration.setProperty(" hibernate.connection.pool_size", "10");
			 s = HibernateUtil.buildSessionFactory(configuration);
			System.out.printf("SessionCre");

		}
		catch (Exception e){
			e.printStackTrace();
		}
		return s;
	}
	@Bean
	public SessionFactory s2(){
		SessionFactory s = null;
		try {
			Configuration configuration = new Configuration();
			configuration.setProperty("connection.driver_class","com.mysql.jdbc.Driver");
			configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/yyyy");
			configuration.setProperty("hibernate.connection.username", "username");
			configuration.setProperty("hibernate.connection.password", "password");
			configuration.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
			configuration.setProperty("hibernate.hbm2ddl.auto", "none");
			configuration.setProperty("show_sql", "true");
			configuration.setProperty(" hibernate.connection.pool_size", "10");
			s = HibernateUtil.buildSessionFactory(configuration);
			System.out.printf("SessionCre");

		}
		catch (Exception e){
			e.printStackTrace();
		}
		return s;
	}
}
