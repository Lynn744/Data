package jdc_revision;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {20, 11, 66, 34, 9, 43};
		
		int max = 0;
		int min = numbers[0];
		
		for(int i = 0; i < numbers.length; i++) {
			if(max<numbers[i]) {
				max=numbers[i];
			}
			if(min>numbers[i]) {
				min=numbers[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
