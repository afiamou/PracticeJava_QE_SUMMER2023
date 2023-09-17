package garbagecollection;

import constructor.PracticeConstructor;

public class PracticeGarbageCollection {
	

	String name="Aziz";
	String address="NJ";
	double salary= 54367.987;
	
	
	public static void main(String[] args) {
		int age=56; 
		
		PracticeGarbageCollection abc= new PracticeGarbageCollection();
		System.out.println(abc.name);
		
		PracticeGarbageCollection abc1= new PracticeGarbageCollection();
		PracticeGarbageCollection abc2= new PracticeGarbageCollection();
		PracticeGarbageCollection abc3= new PracticeGarbageCollection();
		
		
		PracticeConstructor def= new PracticeConstructor();
		
		System.out.println(def.pizzaQty);
		
		PracticeConstructor def1= new PracticeConstructor();
		PracticeConstructor def2= new PracticeConstructor();
		PracticeConstructor def3= new PracticeConstructor();
		
		
		System.gc();  //Requesting JVM for running Garbage Collections
		
		//Another approach 
		
		Runtime.getRuntime().gc();
		
		
		}
	
	public void display() {
		System.out.println("This is display method");
		
	}
}
		
		

