package Homework;

import java.util.Scanner;

public class Homework3_GroceryInvoice3 {
	public static void main (String args[]) {
		
		Scanner input= new Scanner(System.in);
		
	
		
		System.out.println("Enter your Shop Name?");
		String shopName = input.nextLine();
		
		System.out.println("Enter your Shop Address?");
		String shopAddress = input.nextLine();
		
		System.out.println("Enter your Shop Contact Number?");
		String shopContactNumber = input.nextLine();
		
		System.out.println("Enter Today Date?");
		String date = input.nextLine();
		
		System.out.println("Enter Time?");
		String time = input.nextLine();
		
		//Shop Name
		//String shopName="DuaneReade \n  \t      by Walgreens";
	    //String shopAddress="1430 Broadway \n  \t   New York, NY 10019 ";
	    //String shopContactNumber="212-768-0001";
	    //String date="08/23/2023";
	    //String time="1:27 PM";
		
		System.out.println("Enter Area Code?");
		int areaCode = input.nextInt();
		
		System.out.println("Enter shop Code?");
		int shopCode = input.nextInt();
		
		System.out.println("Enter Shop Number?");
		int shopNumber = input.nextInt();
		
	    
	    //int areaCode=326;
	    //int shopCode=8971;
	    //int shopNumber=0002;
		
		System.out.println("Enter First Product Name?");
		String item1Name = input.next();
	
		System.out.println("Enter Second Product Name?");
		String item2Name =input.next();
		
		
		System.out.println("Enter Third Product Name?");
		String item3Name = input.next();
		
		System.out.println("Enter Fourth Product Name?");
		String item4Name = input.next();
		
		System.out.println("Enter Fifth Product Name?");
		String item5Name = input.next();
		
	    
	    //String item1Name="Summer Roll";
	    //String item2Name="Shushi Roll";
	    //String item3Name="Chips";
	    //String item4Name="Candy";
	    //String item5Name="Shopping Bag Fee";
		
		System.out.println("Enter SUBTOTAL?");
		String subTotal = input.nextLine();
		
		System.out.println("Enter Sales Tax?");
		String salesTax = input.nextLine();
		
		System.out.println("Enter Sales Tax Rate?");
		double salesTaxRate = input.nextDouble();
		
		System.out.println("Enter TOTAL?");
		String total = input.nextLine();
		
		System.out.println("Enter VISA?");
		String visaAct = input.nextLine();
		
		System.out.println("Enter Visa Number?");
		int visaNumber = input.nextInt();
		
		System.out.println("Enter CHANGE?");
		String change = input.nextLine();
		
	    
	    //String subTotal="SUBTOTAL";
	    //String salesTax="SALES TAX AMOUNT";
	    //double salesTaxRate=8.875;
	    //String total="TOTAL";
	    //String visaAct="VISA ACCT";
	    //int visaNumber=5463;
	    
	    //String change="CHANGE";
		
		System.out.println("Enter First Menu Name?");
		String menu1 = input.nextLine();
		
		System.out.println("Enter Second Menu Name?");
		String menu2 = input.nextLine();
		
		System.out.println("Enter Third Menu Name ?");
		String menu3 = input.nextLine();
	    
	    
	    //String menu1="Name List";
	    //String menu2="Quantity";
	    //String menu3="Price";
		
		System.out.println("Enter First Quantity?");
		byte quan1 = input.nextByte();
		
		System.out.println("Enter Second Quantity?");
		byte quan2 = input.nextByte();
	    
		System.out.println("Enter Third Quantity?");
		byte quan3 = input.nextByte();
		
		System.out.println("Enter Fourth Quantity?");
		byte quan4 = input.nextByte();
		
		System.out.println("Enter Fifth Quantity?");
		byte quan5 = input.nextByte();
		
	    //byte quan1=1;
	    //byte quan2=1;
	    //byte quan3=1;
	    //byte quan4=2;
	    //byte quan5=1;
	    
		System.out.println("Enter First Item Amount?");
		double item1Amount = input.nextDouble();
		
		System.out.println("Enter Second Item Amount?");
		double item2Amount = input.nextDouble();
		
		System.out.println("Enter Third Item Amount?");
		double item3Amount = input.nextDouble();
		
		System.out.println("Enter Fourth Item Amount?");
		double item4Amount = input.nextDouble();
		
		System.out.println("Enter Fifth Item Amount?");
		double item5Amount = input.nextDouble();
		
		System.out.println("Enter Sales Tax Percentage?");
		double salesTaxPercentage = input.nextDouble();
		
		
		
	    
		//double item1Amount=7.00;
		//double item2Amount=8.00;
		//double item3Amount=2.50;
		//double item4Amount=4.50;
		//double item5Amount=0.05;
		double subTotalAmount=item1Amount+item2Amount+item3Amount+item4Amount+item5Amount;
		
		//double salesTaxPercentage=8.875;
		double salesTaxAmount= subTotalAmount*salesTaxPercentage/100;
	
		double totalAmount=subTotalAmount+salesTaxAmount;
		
		
		double visaAcct=totalAmount;
		
		
		
		
		
		
		
		
		System.out.println("               "+shopName+"            ");
		//Shop Address
		System.out.println("             "+shopAddress+"         ");
		//Shop Phone Number
		System.out.println("               "+shopContactNumber+"          ");
		System.out.println();
		System.out.println();
		System.out.println("  "+areaCode+"    "+shopCode+"    "+shopNumber+"    "+date+"     "+time+"            ");
		System.out.println();
		System.out.println("    << BUY 1 GET 1 EQUAL/LESS VALUE 50% OFF >>            ");
		System.out.println(""+menu1+"                  "+menu2+"           "+menu3+"          ");
		System.out.println("------------------------------------------------------  ");
		System.out.println(""+item1Name+"                  "+quan1+"              "+item1Amount+"          ");
		System.out.println(""+item2Name+"                  "+quan2+"              "+item2Amount+"          ");
	    System.out.println(""+item3Name+"                        "+quan3+"              "+item3Amount+"          ");
	    System.out.println(""+item4Name+"                        "+quan4+"              "+item4Amount+"          ");
		System.out.println("**********************************************************");
		System.out.println(""+item5Name+"             "+quan5+"              "+item5Amount+"          ");
		System.out.println();
		System.out.println("         "+subTotal+"                          "+subTotalAmount+"          ");
		System.out.println("         "+salesTax+" "+salesTaxRate+"             "+String.format("%.3f",salesTaxAmount+"          "));
		System.out.println();
		System.out.println("         "+total+"                             "+String.format("%.3f",totalAmount+"          "));
		System.out.println("         "+visaAct+"   "+visaNumber+"                  "+totalAmount+"          ");
		System.out.println("         "+change+"                              .00          ");
		System.out.println();
		System.out.println();
		System.out.println("     MYWALGREENS SAVINGS                    3.00          ");
		System.out.println();
		System.out.println("          THANK YOU FOR SHOPPING AT DUANE READE           ");
		
		
	
		
		
	}



}
