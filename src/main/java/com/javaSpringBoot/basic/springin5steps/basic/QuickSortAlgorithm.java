package com.javaSpringBoot.basic.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		// Logic for Quick Sort
		return numbers;
	}
}
