package com.javaSpringBoot.basic.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")   // by default it's singleton.
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // good practice
public class BinarySearchImpl {
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		//Implement search logic
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		//Search the array
		
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		LOGGER.info("post construct!");
	}
	
	@PreDestroy
	public void preDestroy() {
		LOGGER.info("pre destroy!");
	}

}
