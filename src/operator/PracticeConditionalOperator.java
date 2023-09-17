package operator;

public class PracticeConditionalOperator {
	
	//&& AND conditional operator: All the condition must have to be true then it will execute if block of code
	// || OR conditional operator: pipe | : One conditional must have to be true it will execute if block of code
	
	public static void main(String[]args) {
		
		int num1= 75;
		int num2= 65;
		String name = "Afia";
		String stName="Mou";
		
		if(num1==num2 && name=="afia") {
			System.out.println("Yahoo");
		}else {
			System.out.println("Google");
			
		}
		
		if( num1== 55 && num2== 65 && name =="Afia") {
			System.out.println("Ferdous");
		}else {
			System.out.println("Ana");
		}
		if( num1== 55 || num2== 65 || name =="Afia") {
			System.out.println("IPhone 14");
		}else {
			System.out.println("Sold Out");
		}
	}
	

}
