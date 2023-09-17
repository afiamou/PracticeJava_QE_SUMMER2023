package controlflow;

import java.util.Scanner;

public class PracticeIfElse {

	//Control flow will help us to make the decision and give the direction to move forward
	
	//Expected Result = 90
	//Actual Result =85
	
	//if the condition is true then if block of code will execute
	//if the condition is false then if block of code will not execute
	//if the condition is false then else block of code will execute
	
	static String stName="Afia";
	static int age = 20;
	
	public static void main (String[]args) {
		
		//if else
		//if(condition){	}
		
		if(age == 28) {
			
		System.out.println("Hello");
		
		}
		if(age == 45) {
			//if condition true
			
			System.out.println("afia");
			
			}else {
				//if condition false
				System.out.println("Mou");
				
			}
		if(age>12) {
			
			System.out.println("You are eligible");
			
			}else {
				System.out.println("you are not eligible");
				
			}
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your Name");
		
		String name=input.next();
		System.out.println("Enter your age");
		int ageIn=input.nextInt();
		System.out.println("Enter Your Gender");
		String gender=input.next();
		
		
		if(name.equalsIgnoreCase("James")){
			System.out.println("Your name is James");
			
		}else {
			System.out.println("Your name is not James");
		}
		
		if(ageIn>=18 && gender.equalsIgnoreCase("False")) {
			System.out.println("Female is eligible for vote");
			
		}else {
			System.out.println("You are not Eligible for vote");
		
		}	
			
		System.out.println("***********************************");
			
			int number= 56;
			
			if(number==66){
				System.out.println("We are learning Control flow");
				
			} else if(number==76) {
				System.out.println("Yahoo");
			}
			else {
				System.out.println("We are not learning Control flow");
			}

			
			if(number==60){
				System.out.println("We are learning Control flow");
				
			} else if(number>50) {
				System.out.println("Yahoo");
				
			}else if(number<45) {
				System.out.println("Google");
			}
			else {
				System.out.println("We are not learning Control flow");
			}
			
		}
		
		
		
	}
