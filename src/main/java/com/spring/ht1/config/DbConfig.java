package com.spring.ht1.config;

import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {

	@Bean
	@ConditionalOnMissingBean
	public DataSource dataSource() {
		DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("org.h2.Driver");
		dataSourceBuilder.url("jdbc:h2:mem:ht1");
		dataSourceBuilder.username("admin");
		dataSourceBuilder.password("superAdmin");
		return dataSourceBuilder.build();
	}

	@Bean(name = "dataSource")
	@ConditionalOnMissingBean
	public DataSource dataSource2() {
		DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("org.h2.Driver");
		dataSourceBuilder.url("jdbc:h2:mem:ht2");
		dataSourceBuilder.username("admin");
		dataSourceBuilder.password("superAdmin");
		return dataSourceBuilder.build();
	}
}
