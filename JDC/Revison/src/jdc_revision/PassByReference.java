package jdc_revision;

public class PassByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {10, 11, 12};
		System.out.print("Before: ");
		for(int a: values) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		increase(values);
		
		System.out.print("After: ");
		for(int a: values) {
			System.out.print(a+" ");
		}
	}
	
	 static void increase(int[] a) {
		for(int i = 0;i < a.length; i++) {
			a[i]+=5;
	 	}
	}
}