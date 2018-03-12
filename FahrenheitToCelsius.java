package com.batchtwoproject.datatypes;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		double f,c;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a degree in Fahrenheit:");
		f = scan.nextDouble();
		c = (f - 32.0) * (5.0 / 9.0);
		System.out.println(f + " degree Fahrenheit is equal to " + c + " in Celsius");
	}

}
