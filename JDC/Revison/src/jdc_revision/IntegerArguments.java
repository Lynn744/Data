package jdc_revision;

public class IntegerArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for(String value : args) {
			total += Integer.parseInt(value);
		}
		System.out.println("Total: "+ total);
	}

}
