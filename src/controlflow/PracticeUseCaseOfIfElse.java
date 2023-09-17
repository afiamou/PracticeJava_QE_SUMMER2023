package controlflow;

import java.util.Scanner;

public class PracticeUseCaseOfIfElse {
	
	
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your age to get the retirement Calculation");
		int age=input.nextInt();
		
		if(age>=0 && age<=40) {
			System.out.println("Your age is more or less than 24");
			
		}else if(age>40 && age<=50) {
			System.out.println("Your age is more then 40");
			
		}else if(age>50 && age<=64) {
			System.out.println("Your age is more then 50");
			
		}else {
			System.out.println("Your age is eligible to get the Retirement");
			
		}
	}
	

}
