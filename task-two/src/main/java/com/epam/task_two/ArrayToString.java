package com.epam.task_two;

import java.util.Scanner;

public class ArrayToString {

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
	private static String arrayToString(int[] elements) {
		StringBuilder stringBuilder = new StringBuilder();
		int length = elements.length;
		
		for(int i = 0; i < length; i++) {
			stringBuilder.append(elements[i]);
			if(i != length-1) {
				stringBuilder.append(", ");
			}
		}
		return stringBuilder.toString();
	}
	public static void main(String[] args) {
		int[] elements = getInput();
		System.out.println(arrayToString(elements));
	}
}
