package com.batchtwoproject.datatypes;

import java.util.Scanner;

public class IntegerSum {

	public static void main(String[] args) {
		int num, f, s, t, remain, sum;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Input an integer between 0 and 1000:");
		num = scan.nextInt();
		f = num % 10;
		remain = num / 10;
		s = remain % 10;
		remain = remain / 10;
		t = remain % 10;
		sum = f + s + t;
		System.out.println("The sum of all digits in " + num + " is " + sum);
	}

}
