package jdc_revision;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {53,12,15,43,6,-14};
		showArray(values,"Before");
		showArray(values, "Sorting");
		
		int [] result = sort(values);
		showArray(values, "After");
	}
	static int[] sort(int[] arr) {
		int temp = 0;
		for(int step = 0; step < arr.length;step++) {
			for(int times = 0;times < arr.length - 1;times++) {
				if(arr[times] > arr[times+1]){
					temp = arr[times];
					arr[times] = arr[times+1];
					arr[times + 1] = temp;
				}
				showArray(arr,"Sorting");
			}
			System.out.println();
		}
		return arr;
	}
	
	static void showArray(int[] a ,String text) {
		System.out.printf("%-8s: ",text);
		for(int value:a) {
			System.out.printf("%3d ",value);
		}
		System.out.println();
	}

}
