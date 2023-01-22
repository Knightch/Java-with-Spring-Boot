package com.javaSpringBoot.basic.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.javaSpringBoot.basic.springin5steps.basic.BinarySearchImpl;
import com.javaSpringBoot.basic.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {
	
	public static void main(String[] args) {
		
		Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcconnection());
		
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcconnection());
		
	}

}
