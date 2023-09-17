package operator;

public class PracticeArithmeticOperator {
	

	// ArithmeticOperator
	
	// + Additive operator
	// - subtraction operator
	// * multiplication operator
	//  / division operator:   40/20    2
	//  % Remainder operator:   10/3    result 3   remainder 1 
	
	public static void main(String[]args) {
		
		int num1=75;
		int num2=500;
		int sum=num1+num2;
		int sub=num2-num1;
		int multi=num1*num2;
		
		int division=num2/num1;
		int remainder=num2%num1;
		
		System.out.println("Sum :" +sum);
		System.out.println("Sub :"+ sub);
		System.out.println("Multi :" +multi);
		System.out.println("Division :" +division);
		System.out.println("Remainder :"+remainder);
		
		System.out.println( ( ( ( (num1-num2) * num1) ) / num2 ) % num1     );
		
		
		
		
	}

}
