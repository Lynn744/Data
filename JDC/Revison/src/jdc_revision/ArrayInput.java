package jdc_revision;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many names do you want to enter?(digit only):");
		int index =Integer.parseInt(input.nextLine());
		
		String[] names = new String[index];
		System.out.println("Array "+names.length);
		System.out.println();
		
		for(int i=0;i<names.length;i++) {
		System.out.print("Enter Names: ");
		names[i] = input.nextLine();
		}
		
		//get input for array
		System.out.println();
		System.out.println("Your names list: ");
		System.out.println("=================");
		
		//output from an array
		for(int i = 0; i<names.length; i++) {
			System.out.printf("%d. %s%n",i+1+1,names[i]);
		}
		input.close();
	}
	
}
