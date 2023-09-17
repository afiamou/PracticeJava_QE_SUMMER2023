package basic;

public class PracticeNestedClass {
	
	//Parent Class/MAin class
	
	int age=55;
	static String firstName="Afia";
	
	//nested child
	
	public static void main(String[]args) {
		System.out.println("Hello");
		System.out.println(Mobile.num);
		
		Mobile ob=new Mobile();
		
		System.out.println(ob.age);
		
		Mobile.mobileDisplay();
	}
	
	public static class Mobile{
		
		//nested Class
		
	
		
		public int age=45;
		static int num=55;
		
		public static void mobileDisplay() {
			
			System.out.println("Mobile Display");
		}

		public static void main(String[]args) {
			System.out.println("Nested Class");
			
			System.out.println(Mobile.num);
			Mobile obj= new Mobile();
			
			System.out.println(obj.age);
			
			Mobile.mobileDisplay();
			

			PracticeNestedClass myObj= new PracticeNestedClass();
			
			System.out.println(myObj.age);
			
			
			
			
			
		}
	}
}

