package rapido_p2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		
		char userChoice;
		double userFeet;
		double userInches;
		double userMeter;
		double userLbs;
		double userKg;
		double BMI;
		
		System.out.print("Would you like to use Standard (s) or Metric method (m)?");
		
		userChoice = scnr.next().charAt(0);
		
		if (userChoice == 's' || userChoice == 'S') {
			
			System.out.println("Please enter your Height in Feet and Inches (ex: 5 11): ");
			
			userFeet = scnr.nextDouble();
			userInches = scnr.nextDouble();
			
			System.out.println("Please enter your weight in Pounds (ex: 190): ");
			
			userLbs = scnr.nextDouble();
			
			BMI = (703 * userLbs) / Math.pow(((userFeet * 12) + userInches), 2);
			
			System.out.printf("Your BMI is : %.1f\n", BMI);
			
			// (703 * weight)/height in inches squared
		}
		
		else if (userChoice == 'm' || userChoice == 'M') {
			
			System.out.println("Please eneter your Height in Centimeters (ex 150): ");
			
			userMeter = scnr.nextDouble();
			
			System.out.println("Please enter your Weight in Kilograms (ex 145): ");
			
			userKg = scnr.nextDouble();
			
			BMI = userKg / Math.pow((userMeter / 100), 2);
			
			System.out.printf("Your BMI is : %.1f\n", BMI);
			
			
			//kg/height in meteres squared.
		}
		
		else {
			System.out.println("Sorry invalid option try again");
			
		}
		
		System.out.println("________________________");
		System.out.println("Underweight = < 18.5\r\n" + 
				"Normal weight = 18.5 – 24.9 \r\n" + 
				"Overweight = 25 – 29.9 \r\n" + 
				"Obesity = BMI of 30 or greater");
		System.out.println("________________________");
		System.out.println("Have a nice day");

	}

}