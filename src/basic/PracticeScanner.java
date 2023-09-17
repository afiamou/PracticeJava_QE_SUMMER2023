package basic;

import java.util.Scanner;

public class PracticeScanner {
	
	//copy or scan a picture:**Take input===>out put: Your picture scanned copy
	
	//Class name Scanner
	
	public static void main(String[]args) {
		System.out.println("What is your name?");
		
		String name="Afia";
		
		//how to create a object of a class?
		//ClassName objectName=new className();
		
		Scanner input= new Scanner(System.in);
		
		String myName = input.nextLine();
		
		System.out.println("My Name is "+myName);
		
		System.out.println("What is your Age?");
		int myAge = input.nextInt();
		System.out.println("My age is "+myAge);
		
		System.out.println("What is your salary?");
		double mySlary =input.nextDouble();
		System.out.println("My Slary is "+mySlary);
		
		
		double number=785987.7896099;
		System.out.printf("%.3f",number);
		System.out.println();
		System.out.println("This number value "+String.format("%.2f",  number));
		
		
		//Scanner close
		input.close();
		
		
		
		
	}

}
