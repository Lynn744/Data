package jdc_revision;

public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 10;
		System.out.println("Before: "+ value);
		
		increase(value);
		System.out.println("After: "+value);
	}
	static void increase(int value) {
		value += 5;
	}

}
