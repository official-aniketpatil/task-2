package com.epam.task_two;

import java.util.Scanner;

public class SumAndAverage {

	private static int[] getInput(){
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Enter number of elements in array");
		int length = scanner.nextInt();
		int[] elements = new int[length];
		
		for(int i = 0; i < length; i++) {
			elements[i] = scanner.nextInt();
		}
		
		scanner.close();
		return elements;
	}
	private static float getAverage(int[] elements) {
	   	int length = elements.length;
	   	
	   	return getSum(elements) / length;
	}
	private static int getSum(int[] elements) {
		int sum=0;
		for(int element : elements) {
			sum += element;
		}
		return sum;
	}
	public static void main(String[] args) {
	 
		int[] elements = getInput();
		System.out.println("sum of Array is "+getSum(elements));
		System.out.println("Average of Array is "+getAverage(elements));
	}	

}
