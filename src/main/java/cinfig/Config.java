package cinfig;

import java.sql.DriverManager;

import javax.activation.DataSource;

import org.hibernate.Hibernate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mysql.cj.xdevapi.SessionFactory;

@Configuration
public class Config {
	
	@Bean("ds")
	public DataSource getDsc() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		
		return (DataSource) ds;
	}
	
	@Bean()
	public SessionFactory getSessionFactory() {
		
		
		//ComboPooledDataSource ds = new ComboPooledDataSource();
		return null;
	}
}
