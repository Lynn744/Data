package jdc_revision;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int value = Integer.parseInt(input.nextLine());
		
		if(isPrime(value)) {
			System.out.printf("%d is a Prime.%n",value);
		}else {
			System.out.printf("%d is not a Prime.%n",value);
		}
	}
	static boolean isPrime(int value) {
		if(value < 2) {
			return false;
		}
		for(int divisor = 2;divisor < value;divisor++) {
			System.out.println("Divide by: "+divisor);
			if(value% divisor ==0) {
				return false;
			}
		}
		return true;
	}
}
