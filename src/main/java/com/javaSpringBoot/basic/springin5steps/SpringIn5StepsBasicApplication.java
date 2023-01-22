package com.javaSpringBoot.basic.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.javaSpringBoot.basic.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {
	
	//what are the beans? using @component to show beans
	//What are the dependencies of a bean? @Autowird to show beans dependencies
	//Where to search for beans?

	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println("first: " + binarySearch);
		System.out.println("second: "+ binarySearch2);
		
		int result = binarySearch.binarySearch(new int[] {1,4,5}, 3);
		
		System.out.println(result);
	}

}
