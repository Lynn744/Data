package jdc_revision;

public class ArrayInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruits = {"Apple","Orange","Lemon","Pine Apple"};
		System.out.println("Array size: "+fruits.length);
		showArray(fruits);
	}
	static void showArray(String[] arr) {
		for(int index = 0; index<=arr.length;index++) {
			System.out.printf("Index %d: %s%n",index + 1,arr[index]);
			
		}
		System.out.println();
	}
}
