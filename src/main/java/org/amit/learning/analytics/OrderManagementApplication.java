package org.amit.learning.analytics;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("org.amit.learning.analytics.dao.mapper")
public class OrderManagementApplication {

	private static final Logger logger = LoggerFactory.getLogger(OrderManagementApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(OrderManagementApplication.class, "--debug");
	}

}
