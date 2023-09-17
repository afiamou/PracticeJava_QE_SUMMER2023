package basic;

public class PracticeCasting {
	
	//Casting means converting the data type
	
	double yearlySalary=65987.9878;
	
	
	public static void main(String[]args) {
		
		double salary=75000.900;
		int newSalary=(int)salary;
		
		System.out.println(newSalary);
		
		//int to double
		
		int price= 4000;
		double newPrice=(double)price;
		
		System.out.println(newPrice);
		
		//double to int
		
		//create an object
		
		PracticeCasting pc= new PracticeCasting();
		int newYearlySalary=(int)pc.yearlySalary;
		
		System.out.println(pc.yearlySalary);
		pc.yearlySalary= 897000.9876;
		
		System.out.println(pc.yearlySalary);
		
		

		
		
	}

}
