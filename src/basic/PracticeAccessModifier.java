package basic;

public class PracticeAccessModifier {
	
	//Access
	
	
	//public= no restrictions: HAve to access from any packages
	//private= full restrictions: HAve to access from same class only
	//protected= Have to access in same Package
	//Default= Same behavior like protected
	
	//Call to a variable use static after public
	
	//if you declare a variable is public then you can call it from any class or package
	
	//if you declare any variable is static, it means you can call that variable by its class name
	
	public static String name="Afia";
	
	public static int number= 1214;
	
	public static boolean isPizzaAvailable1=true;
	public static boolean isPizzaAvailable=false;
	
	public static double pizzaPrice=15.95;
	private static double candyPrice=2.50;
	
	protected static double totalPizzaPrice=25.45;
	
	
	
	private static String phoneNumber="9832317878";
	
	
	
	public static void main(String[]args) {
		
		System.out.println(candyPrice);
		System.out.println(phoneNumber);
		
		
		
		
		
	}

}
