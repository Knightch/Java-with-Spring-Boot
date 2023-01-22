package com.javaSpringBoot.basic.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.javaSpringBoot.basic.componentscan.ComponentDAO;
import com.javaSpringBoot.basic.springin5steps.basic.BinarySearchImpl;
import com.javaSpringBoot.basic.springin5steps.scope.PersonDAO;

@SpringBootApplication
@ComponentScan("com.javaSpringBoot.basic.componentscan")
public class SpringIn5StepsComponentScanApplication {
	

	public static void main(String[] args) {
		
		Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		
		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDao);
	}

}
