# java
code
package swithcase.com;

import java.util.Scanner;

public class Aera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		float len,bre,base,heigth,rad;
		double aera;
		Scanner sc=new Scanner(System.in);
		System.out.println("MENU");
		
		System.out.println("1.Aera of square");
	    System.out.println("3.Aera of recantgle");
		System.out.println("4.Aera of cricle");
		System.out.println("enter YOUR CHOICE");
			 ch=sc.nextInt();
			 switch(ch) {
			 case 1:
				 System.out.println("1.Aera of square");
				 len = sc.nextFloat();
				 aera = len*len;
				 System.out.println("enter of squaer "+aera);
				 break;
			 case 2:
				  System.out.println("3.Aera of ");
				 len = sc.nextFloat();
				 heigth = sc.nextFloat();
				 base = sc.nextFloat();
				 aera = 1/2*base*heigth;
				 System.out.println("enter of tirangle "+aera);
				 break;
			 case 3:
				  System.out.println("3.Aera of recantgle");
				 len = sc.nextFloat();
				 bre = sc.nextFloat();
				 aera = len*bre;
				 System.out.println("enter of recantgle "+aera);
				 break;
			 case 4:
				  System.out.println("3.Aera of cricle");
				 rad = sc.nextFloat();
				 aera = 3.14159*rad*rad;
				 System.out.println("enter of cricle"+aera);
				 break;
			 default : System.out.println("invalid");
				
				 
				  
			 }
	}

	public void areasqure() {
		// TODO Auto-generated method stub
		
	}

	

	
}
