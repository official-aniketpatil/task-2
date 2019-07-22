package com.epam.task_two;

import java.util.Scanner;

public class UnitConversion {

	private static void printMenu() {
		System.out.println("Enter your choice");
		System.out.println("1) Inch to Feet");
		System.out.println("2) Inch to Meter");
		System.out.println("3) Feet to Inch");
		System.out.println("4) Feet to Meter");
		System.out.println("5) Meter to Inch");
		System.out.println("6) Meter to Feet");
		System.out.println("0) Exit");
		
	}
	private static double inchToFeet(double inch) {
		return  0.0833 * inch;
	}
    private static double inchToMeter(double inch) {
    	return 0.0254 * inch;
	}
    private static double feetToInch(double feet) {
		return 12 * feet;
	}
    private static double feetToMeter(double feet) {
		return feet / 3.281;
	}
    private static double meterToInch(double meter) {
		return 39.37 * meter;
	}
    private static double meterToFeet(double meter) {
		return 3.281 * meter;
	}
    private static void printResult(int choice, double value) {
    	
    	switch(choice) {
    	case 1:
    	    System.out.println(value+" Inch = "+inchToFeet(value)+"Feet");
    	    break;
    	case 2:
    		System.out.println(value+"Inch = "+inchToMeter(value)+" Meter");
    		break;
    	case 3:
    		System.out.println(value+" Feet = "+feetToInch(value)+" Inch");
    		break;
    	case 4:
    		System.out.println(value+" Feet = "+feetToMeter(value)+" Meter");
    		break;
    	case 5:
    		System.out.println(value+" Meter = "+meterToInch(value)+" Inch");
    		break;
    	case 6:
    		System.out.println(value+" Meter = "+meterToFeet(value)+" Feet");
    		break;
    	default:
    		System.out.println("Enter a valid choice");
    	}
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		while(true) {
        	printMenu();
        	int choice=scanner.nextInt();
        	double value=scanner.nextDouble();
        	if(choice == 0) {
        		break;
        	}
        	printResult(choice,value);
        }
        
        System.out.println("Program terminated !!");
        scanner.close();
	}

}
