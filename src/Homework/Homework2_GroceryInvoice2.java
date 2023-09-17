package Homework;

public class Homework2_GroceryInvoice2 {
	public static void main (String args[]) {
		//Shop Name
		String shopName="DuaneReade";
	    String shopAddress="1430 Broadway ";
	    String shopContactNumber="212-768-0001";
	    String date="08/23/2023";
	    String time="1:27 PM";
	    
	    int areaCode=326;
	    int shopCode=8971;
	    int shopNumber=0002;
	    
	    String product1Name="Summer Roll";
	    String product2Name="Shushi Roll";
	    String product3Name="Chips";
	    String product4Name="Candy";
	    String product5Name="Shopping Bag Fee";
	    
	    String item6Name="SUBTOTAL";
	    String item7Name="SALES TAX AMOUNT";
	    double salesTaxRate=8.875;
	    String item8Name="TOTAL";
	    String item9Name="VISA ACCT";
	    int visaNumber=5463;
	    
	    String item10Name="CHANGE";
	    
	    
	    String menu1="Name List";
	    String menu2="Quantity";
	    String menu3="Price";
	    
	    byte quan1=1;
	    byte quan2=1;
	    byte quan3=1;
	    byte quan4=2;
	    byte quan5=1;
	    
	    
	    
		double item1Amount=7.00;
		double item2Amount=8.00;
		double item3Amount=2.50;
		double item4Amount=4.50;
		double item5Amount=0.05;
		double subTotalAmount=item1Amount+item2Amount+item3Amount+item4Amount+item5Amount;
		double salesTaxPercentage=8.875;
		double salesTaxAmount= subTotalAmount*salesTaxPercentage/100;
		double totalAmount=subTotalAmount+salesTaxAmount;
		double visaAcct=totalAmount;
		
		
		
		
		
		
		
		
		System.out.println("               "+shopName+"            ");
		System.out.println("              by Walgreens           ");
		//Shop Address
		System.out.println("             "+shopAddress+"         ");
		System.out.println("           New York, NY 10019        ");
		//Shop Phone Number
		System.out.println("               "+shopContactNumber+"          ");
		System.out.println();
		System.out.println();
		System.out.println("  "+areaCode+"    "+shopCode+"    "+shopNumber+"    "+date+"     "+time+"            ");
		System.out.println();
		System.out.println("    << BUY 1 GET 1 EQUAL/LESS VALUE 50% OFF >>            ");
		System.out.println(""+menu1+"                  "+menu2+"           "+menu3+"          ");
		System.out.println("------------------------------------------------------  ");
		System.out.println(""+product1Name+"                  "+quan1+"              "+item1Amount+"          ");
		System.out.println(""+product2Name+"                  "+quan2+"              "+item2Amount+"          ");
	    System.out.println(""+product3Name+"                        "+quan3+"              "+item3Amount+"          ");
	    System.out.println(""+product4Name+"                        "+quan4+"              "+item4Amount+"          ");
		System.out.println("**********************************************************");
		System.out.println(""+product5Name+"             "+quan5+"              "+item5Amount+"          ");
		System.out.println();
		System.out.println("         "+item6Name+"                          "+subTotalAmount+"          ");
		System.out.println("         "+item7Name+" "+salesTaxRate+"             "+salesTaxAmount+"          ");
		System.out.println();
		System.out.println("         "+item8Name+"                             "+totalAmount+"          ");
		System.out.println("         "+item9Name+"   "+visaNumber+"                  "+totalAmount+"          ");
		System.out.println("         "+item10Name+"                              .00          ");
		System.out.println();
		System.out.println();
		System.out.println("     MYWALGREENS SAVINGS                    3.00          ");
		System.out.println();
		System.out.println("          THANK YOU FOR SHOPPING AT DUANE READE           ");
		
		
		
	}



}
