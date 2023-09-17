package basic;

public class PracticeStatic {
	
	//Static is a keyword which will allow to call a variable or method by call name.
	
	public static String studentName="Afia";
	
	public String studentAddress="Bronx";
	
	//static method call by class name to execute the method
	
	//static variable is call by class name and non static variable is call by object 
	
	
	public static void main(String[]args) {
		
		System.out.println("Student Name : "+PracticeStatic.studentName);
		System.out.println("Student Name : "+studentName);
		
		
		//call by object name
		//className objectName= new className();
		//Create an object of a class
		
		PracticeStatic obj= new PracticeStatic();
		
		System.out.println(obj.studentAddress);
		
		PracticeStatic.display();
		PracticeStatic.tvDisplay();
		

		Car.monitorDisplay();
		
		//Create object
		
		Car myCar= new Car();
		myCar.mobileDisplay();
		
		}
		

	public static void display() {
		System.out.println("This is Display method");
	}
		
		public static void tvDisplay() {
			System.out.println("This is TV Display method");
			
		}
		public static class Car{
			//NEsted class
			
			int age=15;
			static int num=20;
			
			public static void monitorDisplay() {
				System.out.println("This is Monitor Display method");
				
			}
			
			public static void mobileDisplay() {
				System.out.println("This is Mobile Display");
				
			}
		}
		
	}

