package jdc_revision;

import java.util.Scanner;

public class SwitchSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int number = input.nextInt();
		
		switch (number) {
		case 1: {
			System.out.println("One");
			break;
		}
		case 2:{
			System.out.println("two");
			break;
		}
		default:
			System.out.println("enter a number under 3");
		}
		input.close();
	}
}
