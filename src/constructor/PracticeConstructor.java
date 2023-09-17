package constructor;

public class PracticeConstructor {
	
	public int pizzaQty=30;
	static String pizzaName="Chicken PIzza";
	
	String studentName;
	
	double courseFee;
	int courseDuration;
	double perCreditFee;
	String professorName;
	String versityLocation;
	boolean isCourseAvailable;
	
	
	//Constructor is always create inside class level
	//Constructor name should be same as class name
	//Constructor does not have any return Type.
	
	//accessModifier className/ConstructorName () {  }
	
	public PracticeConstructor() {
		
		//Default Constructor : Without Parameter
		
		System.out.println("Hello Afia");
		System.out.println("Hello Afia2");
		
		int num1=20;
		int num2=10;
		int total=num1+num2;
		
		System.out.println("Total :"+total);
		
		
	}
	//Single parameterize constructor
	
	public PracticeConstructor(String name) {
		this.studentName=name;
		
		System.out.println("Student Name :"+this.studentName);
		
		
	}
	
	//Double Parameterize COnstructor/Dynamic
	public PracticeConstructor(int num1, int num2) {
		int total=num1+num2;
		System.out.println("Total value : "+total);
		
	}
	
	public PracticeConstructor(double num1, double num2) {
		double total= num1 + num2;
		System.out.println("Total value:"+total);
		
		
	}
	
	public PracticeConstructor(double num1, double num2, double num3) {
		double total= num1 + num2 +num3;
		System.out.println("Total value:"+total);
		
		
	}
	//Triple PArameterize Constructor/Dynamic
	public PracticeConstructor(String stId, String stName, int stage) {
		System.out.println("Student ID"+ stId+"\nStudent Name"+stName+"\nStudent Age"+stage);
		
		
	}
	
	//Five Parameterize  //Global variable =Local Variable
	
	public PracticeConstructor(String professorName, String versityLocation, int courseDuration, double courseFee, boolean isCourseAvailable) {
		this.professorName= professorName;
		this.versityLocation=versityLocation;
		this.courseDuration=courseDuration;
		this.courseFee=courseFee;
		this.isCourseAvailable=isCourseAvailable;
		
		System.out.println("Professor Name :"+this.professorName);
		System.out.println("Versity Location :"+this.versityLocation);
		System.out.println("Course Duration :"+this.courseDuration);
		System.out.println("Course Fee :"+this.courseFee);
		System.out.println("IS Course Available :"+this.isCourseAvailable);
		
		
		
		
	}
	
	public static void main(String[]args) {
		
		
		//Create an object
		//ClassName objectName= new ClassName();
		//ClassName() Constructor of the Class
		
		
		
		PracticeConstructor pc= new PracticeConstructor();
		
	System.out.println("Pizza qty : "+pc.pizzaQty);	
	System.out.println("Pizza Name :"+PracticeConstructor.pizzaName);
	
	
	PracticeConstructor spc= new PracticeConstructor("alif");
	
	PracticeConstructor spc1= new PracticeConstructor("farin");
	
	PracticeConstructor spc2= new PracticeConstructor(20,15);
	
	PracticeConstructor spc3= new PracticeConstructor("101", "Ana",15);
	
	PracticeConstructor spc4= new PracticeConstructor("Jacky", "Boston",10, 32078.987, true);
	
	PracticeConstructor spc5= new PracticeConstructor(10.12, 15.12);
	
	PracticeConstructor spc6=new PracticeConstructor(20.50, 15.50, 40.50);
	
	
		
	}
	

}
