package jdc_revision;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		int[] number = new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		for(int i=0; i<number.length; i++) {
		number[i] = Integer.parseInt(sc.next());
		}
		EvenOdd(number);
		sc.close();
	}
	static void EvenOdd(int[]num) {
		for(int i=0; i<num.length;	i++	) {
			if(num[i]%2==0) {
				System.out.println(num[i]+" is an even number.");
			}else
				System.out.println(num[i]+" is an odd number.");
		}
	}
}
