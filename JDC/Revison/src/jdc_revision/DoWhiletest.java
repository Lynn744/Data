package jdc_revision;

import java.util.Scanner;

public class DoWhiletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String answer = null;
		do {
			System.out.println("Enter your name:");
			String name = input.nextLine();
			System.out.println("hello: "+name);
			System.out.println("tryagain?");
			answer = input.nextLine();
		}while(answer.equals("y"));
		System.out.println("Program terminate...");
		input.close();
	}

}
