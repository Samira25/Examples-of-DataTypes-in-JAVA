package com.batchtwoproject.datatypes;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		try {
			double height, ft, weight, bmi;
			String str = "";
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("Input weight in kg:");
			weight = scan.nextDouble();
			System.out.println("Input height in ft:");
			ft = scan.nextDouble();
			System.out.println("Female or Male?");
			str = scan.next();
			height = ft / 3.28;
			bmi = weight / (double) (Math.pow(height, 2));
			System.out.println("Body Mass Index is " + bmi);

			switch (str){
				case "Female":
					if (bmi < 19.1){
						System.out.println("So you are Underweight");
					}
					else if (bmi >= 19.1 && bmi <= 25.8){
						System.out.println("So you have Normal weight");
					}
					else if (bmi >= 25.8 && bmi <= 27.3){
						System.out.println("So you have marginally overweight");
					}
					else if (bmi >= 27.3 && bmi <= 32.3){
						System.out.println("So you have Overweight");
					}
					else if (bmi >= 32.3){
						System.out.println("So you are Obese");
					}
					break;
				case "Male":
					if (bmi < 20.7){
						System.out.println("So you are Underweight");
					}
					else if (bmi >= 20.7 && bmi <= 26.4){
						System.out.println("So you have Normal weight");
					}
					else if (bmi >= 26.4 && bmi <= 27.8){
						System.out.println("So you have marginally overweight");
					}
					else if (bmi >= 27.8 && bmi <= 31.1){
						System.out.println("So you have Overweight");
					}
					else if (bmi >= 31.1){
						System.out.println("So you are Obese");
					}
					break;
			}
		} catch (Exception e){
			System.out.println(e);
		}
	}

}
