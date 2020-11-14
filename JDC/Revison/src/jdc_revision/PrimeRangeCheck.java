package jdc_revision;

import java.util.Scanner;

public class PrimeRangeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Start number to search prime:");
		int start = Integer.parseInt(input.nextLine());
		System.out.print("End number to search prime:");
		int count ;//number of count that remainds 0
		int end = Integer.parseInt(input.nextLine());
		System.out.print("Prime numbers between "+start +" and "+end +" are: ");
		if(end<start) {
			System.out.println("Please enter the appropriate start and end number.");
		}
		 else {
			for(int i = start;i<end;i++) {//numbers=>start++
				count =0;
				for(int j=1;j<=i;j++) {//j=divisor
					if(i%j ==0) {
						count ++;	
					}
				}
				if(count == 2){
					System.out.printf("%d ",i);
				}
			}	
		}
		input.close();
	}

}
