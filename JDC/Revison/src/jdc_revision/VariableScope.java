package jdc_revision;

public class VariableScope {
	//Static Variable
	static int digit = 1234;
	//Instance Variable
	String name ="jdc";
	
	public static void main(String[] args) {
		//Local Variable
		int digit = 123;
		
		System.out.println("Local variable: "+digit);
		System.out.println("Static Variable: "+VariableScope.digit);
		System.out.println();
		
		VariableScope scope = new VariableScope();	
		scope.method();
	}
	void method() {
		//Local Variable
		String name = "Kyaw Kyaw";
		System.out.println("Local Variable: "+name);
		System.out.println("Instance Variable: "+ this.name);
	}

}
