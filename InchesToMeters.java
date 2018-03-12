package com.batchtwoproject.datatypes;

import java.util.Scanner;

public class InchesToMeters {

	public static void main(String[] args) {
		double i,m;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a value for inch:");
		i = scan.nextDouble();
		m = i * 0.0254;
		System.out.println(i + " inch is " + m + " meters");
	}

}
