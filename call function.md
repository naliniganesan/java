# java
code
package swithcase.com;

import java.util.Scanner;

 class AreaClass {
	
	float len,bre,base,heigth,rad;
	double aera;
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc=new Scanner(System.in);
		
		AreaClass ob=new AreaClass();
		System.out.println("1.Aera of square");
		System.out.println("2.Aera of triangle");
	    System.out.println("3.Aera of recantgle");
		System.out.println("4.Aera of cricle");
		System.out.println("enter YOUR CHOICE");
			 ch= sc.nextInt();
			 switch(ch) {
			 case 1:ob.areasquare();
				break;
			 case 2:ob.areatriangle();
				 break;
			 case 3:ob.arearectangle();
			       break;
				  
			 case 4:ob.areacricle();
				  
				 break;
			 default : System.out.println("invalid");
				
				 
				  
			 }
	}

	 public void areacricle() {
		// TODO Auto-generated method stub
		 System.out.println("3.Aera of cricle");
		 rad = sc.nextFloat();
		 aera = 3.14159*rad*rad;
		 System.out.println("enter of cricle"+aera);
	}

	public void arearectangle() {
		// TODO Auto-generated method stub
		 System.out.println("3.Aera of recantgle");
		 len = sc.nextFloat();
		 bre = sc.nextFloat();
		 aera = len*bre;
		 System.out.println("enter of recantgle "+aera);
		 
	}

	public void areatriangle() {
		// TODO Auto-generated method stub
		 System.out.println("3.Aera of ");
		 len = sc.nextFloat();
		 heigth = sc.nextFloat();
		 base = sc.nextFloat();
		 aera = 1/2*base*heigth;
		 System.out.println("enter of tirangle "+aera);
	}

       public void areasquare() {
		// TODO Auto-generated method stub
		System.out.println("1.Aera of square");
		 len = sc.nextFloat();
		 aera = len*len;
		 System.out.println("enter of squaer "+aera);
       }
       
 }
