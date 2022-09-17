# java
code
package student;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		int marks;
	     System.out.println("enter marks");
	     Scanner sc=new Scanner(System.in);
	     marks=sc.nextInt();
	     if(marks>=90 && marks<=100) {
		     System.out.println("grade A");
 
	     }
		
	     else if(marks>=70 && marks<=89) {
		     System.out.println(" grade B");
 
	     }
		
	     else if(marks>=50 && marks<=69) {
		     System.out.println(" grade C");
 
	     }
		  
	     else if(marks>=30 && marks<=49) {
		     System.out.println(" grade D");
 
	     }
	     else if(marks>=0 && marks<=29) {
		     System.out.println("fail");
 
	     }
	     else {
	    	 System.out.println("invalid");
	     }
		
		
	}

}
