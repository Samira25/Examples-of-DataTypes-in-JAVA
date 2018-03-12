package com.batchtwoproject.datatypes;

import java.util.Scanner;

public class MinutesToYears {

	public static void main(String[] args) {
		int min, day, year;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the number of minutes:");
		min = scan.nextInt();
		year = min / 24 / 60 / 365;
		day = (min / 1440) % 365;
		System.out.println(min + " minutes are approximately " + year + " years and " + day + " days");
	}

}
