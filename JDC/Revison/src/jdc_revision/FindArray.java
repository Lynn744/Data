package jdc_revision;

import java.util.Scanner;

public class FindArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] values;
		System.out.println("How many numbers do you want to save? (digit only): ");
		int index = Integer.parseInt(input.nextLine());
		
		values = new int[index];
		System.out.println();
		
		for(int i = 0; i < values.length; i++) {
			System.out.print("Enter number: ");
			values [i] = Integer.parseInt(input.nextLine());
		}	
		System.out.println();
		System.out.print("Enter search number: ");
		int search = Integer.parseInt(input.nextLine());
		
		boolean found = false;
		int count = 0;
		// search value in array
		for(int i =0;i<values.length; i++) {
			if(values[i]==search) {
				
				found = true;
				break;
			}
			count++;
		}
		
		System.out.println(count);
		if(found) {
			System.out.println("Search Number: "+ search +" is found in array.");
		}
		else {
			System.out.println("Search Number: "+ search + "is not found in array.");
		}
	}

}
