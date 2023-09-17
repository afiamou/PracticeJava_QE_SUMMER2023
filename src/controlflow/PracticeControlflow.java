package controlflow;

import java.util.Scanner;

public class PracticeControlflow {
	
	//Control flow will help us to make the decision and give the direction to move forward
	
public static void main(String[]args) {
	
	int age= 10;
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("What is your name?");
	String name=input.next();
	
	System.out.println("What is your age?");
	try {
	 age=input.nextInt();
	}catch(Exception ex) {
		System.out.println("Please Enter Integer type of data");
		age=input.nextInt();
		
	}
	
	System.out.println("My Name is "+name+" and age is " + age);

	input.close();
}

}
