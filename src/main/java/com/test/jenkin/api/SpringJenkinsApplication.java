package com.test.jenkin.api;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static Logger logger = (Logger) LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	public void intt() {
		logger.info("Application Started..");
		logger.info("Application Started two...");
	}
	

	public static void main(String[] args) {
		logger.info("Application Executed...");
		logger.info("Application Executed two...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
