package jdc_revision;

import java.util.Scanner;

public class Temperature_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter your temperature choice: ");
		int temp = input.nextInt();
		
		System.out.print("Enter your count: ");
		int count = input.nextInt();
		
		System.out.printf("%s\t%s\t%s%n","No.","Fahr","Cels");
		System.out.println("=======================");
		for(int i=1;i<=count;i++) {
			temp = temp+10;
			int celsius = (temp-32)*5/9;
			System.out.printf("%d.\t%d\t%d%n",i,temp,celsius);
		}
		input.close();
		
		
	}

}
