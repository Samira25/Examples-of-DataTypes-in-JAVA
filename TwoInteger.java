package com.batchtwoproject.datatypes;

import java.util.Scanner;

public class TwoInteger {

	public static void main(String[] args) {
		int first, second;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Input 1st integer:");
		first = scan.nextInt();
		System.out.println("Input 2nd integer:");
		second = scan.nextInt();
		
		System.out.println("Sum of two integers:" + (first + second));
		System.out.println("Difference of two integers:" + (first - second));
		System.out.println("Product of two integers:" + (first * second));
		System.out.println("Average of two integers:" + ((first + second) / 2));
		System.out.println("Distance of two integers:" + (first - second));
		System.out.println("Max integer:" + (Math.max(first, second)));
		System.out.println("Min integer:" + (Math.min(first, second)));
	}

}
