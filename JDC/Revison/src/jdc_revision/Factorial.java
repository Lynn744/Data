package jdc_revision;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value:");
		
		int value = sc.nextInt();
		int factorial =1;
		
		for(int i=1;i<=value;i++) {	
			factorial = factorial*i;
		}
		System.out.printf("%d! is: %d%n",value,factorial);
	}

}
