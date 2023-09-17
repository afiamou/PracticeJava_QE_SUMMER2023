package basic;

public class PracticeVariable {
	//Global variable is declare something inside the class level and outside from any method
	//Local variable is declare something inside the any method
	
	
	public static void main(String[] args) {
		//DataTyap vairiableName= variableValue;
		//semi colon is used to close a statement
		//Global variable/class level variable
		
		int age = 22;
		
	System.out.println(age);
	
	int number1=30;
	int number2=20;
	int sum = number1+number2;
	int subtraction = number1 - number2;
	int multiply= number1*number2;
	int division=number1/number2;
	
	
	
	
	System.out.println(sum);
	System.out.println(subtraction);
	System.out.println(multiply);
	System.out.println(division);
	
	
	
	System.out.println("********Advance use case of Variable************");
	
	
	int num1=35;
	int num2=45;
	int num3=num1+num2;
	int num4=num2;
	int num5=num4;
	
	int num6=num3+num5;
	
	System.out.println(num6);
	
	
	System.out.println(num5);
	
		
	}
	
	

}
