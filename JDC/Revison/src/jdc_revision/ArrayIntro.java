package jdc_revision;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = new int[10];
		System.out.println("Array Location: "+numbers);
		System.out.println("Array size: "+numbers.length);
		
		numbers[0] = 11;
		numbers[1] = 22;
		numbers[2] = 33;
		
		System.out.println("Index 0: "+numbers[0]);
		System.out.println("Index 1: "+numbers[0]);
		System.out.println("Index 2: "+numbers[0]);
		
		String[] names = new String[5];
		System.out.println("Array Size: "+names.length);
		System.out.println("Index 0: "+names[0]);
	}

}
