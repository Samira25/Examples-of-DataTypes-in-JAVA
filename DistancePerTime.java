package com.batchtwoproject.datatypes;

import java.util.Scanner;

public class DistancePerTime {

	public static void main(String[] args) {
		double meter, hour, min, sec, time, meterpersec, kmperhr, milesperhr;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input distance in meters:");
		meter = scan.nextDouble();
		System.out.println("Input hour:");
		hour = scan.nextDouble();
		System.out.println("Input minute:");
		min = scan.nextDouble();
		System.out.println("Input second:");
		sec = scan.nextDouble();
		
		time = (hour * 3600.0) + (min * 60.0) + sec;
		meterpersec = meter / (time);
		kmperhr = (meter * 3600) * (time * 1000);
		milesperhr = (meter / (time * (3600 / 1000) * (1 / 1.609)));
		
		System.out.println("Your speed in meters/second is " + meterpersec);
		System.out.println("Your speed in km/h is " + kmperhr);
		System.out.println("Your speed in miles/h is " + milesperhr);
	}

}
