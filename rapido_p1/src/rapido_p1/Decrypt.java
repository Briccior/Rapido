package rapido_p1;

import java.util.Scanner;

public class Decrypt {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int x;
		int ones;
		int tens;
		int hundreds;
		int thousands;
		int tmpVal;
		
		System.out.println("Enter a number to decrypt: ");
		x = scnr.nextInt();
		
		ones = ((x % 10) + 3) % 10;
		tmpVal = x / 10;
		tens = ((tmpVal % 10) + 3) % 10;
		tmpVal = tmpVal / 10;
		hundreds = ((tmpVal % 10) + 3) % 10;
		tmpVal = tmpVal / 10;
		thousands = ((tmpVal % 10) + 3) % 10;
		
		System.out.println(thousands + " " + hundreds + " " + tens + " " + ones);
		
		x = (tens * 1000) + (ones * 100) + (thousands * 10) + (hundreds);
		
		System.out.println("The Decrypted number is:" + x);
	}

}
