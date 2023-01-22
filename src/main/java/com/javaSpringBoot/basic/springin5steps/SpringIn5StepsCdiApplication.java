package com.javaSpringBoot.basic.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.javaSpringBoot.basic.springin5steps.basic.BinarySearchImpl;
import com.javaSpringBoot.basic.springin5steps.cdi.SomeCdiBusiness;
import com.javaSpringBoot.basic.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsCdiApplication {
	
	public static void main(String[] args) {
		
		Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCdiApplication.class, args);
		
		SomeCdiBusiness buisness = applicationContext.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("{} dao-{}", buisness, buisness.getSomeCDIDAO());
		
	}

}
