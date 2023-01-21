package com.javaSpringBoot.basic.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm bubbleSortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		//Implement search logic
		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		System.out.println(bubbleSortAlgorithm);
		
		//Search the array
		
		return 3;
	}

}
