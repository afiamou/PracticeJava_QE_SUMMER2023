package basic;

public class PracticeObject {
	
	
	//Line alignment: ctrl+shift+f : Windows
	
	//Object is a instance of a class
	//Object is a blueprint for creating instance of a class
	

	
	int number=44;
	String name="Silvi";
	short monthlySalary=7000;
	double Salary= 56677.987;
	boolean isAvailable=true;
	
	String stName="Afia";
	

	
	
	
	public static void main(String[]args) {
		
		//Why we need to create a object?
		
		//Call the properties by object name instead of class name if the properties are non static.
		
		//Class objectNAme= new ClassName();
		//ClassNAme is the name of the class
		//ObjectName its just a custom name
		//ClassNAme(); Constructor of the class
		
		PracticeObject obj=new PracticeObject();
	
		System.out.println(obj.number);
		
		System.out.println(obj.name);
		System.out.println(obj.monthlySalary);
		System.out.println(obj.isAvailable);
		System.out.println(obj.Salary);
		
		PracticeObject ob= new PracticeObject();
		
		System.out.println(ob.stName);
		

		
		//Can we create multiple object of a class?- yes
		// Non static method is calling by object name
		//If any method or variable is static we call by Class name
		//If any method or variable is non static we call by object.
	
		
	}
	
	
	
	
}

