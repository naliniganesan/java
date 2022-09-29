# java
code
package funoverloadnig.com;

import java.util.Scanner;

public class NumNeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, ne;      
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number to check: ");   
		ne = sc.nextInt();  
		int squ = ne * ne;  
		while(squ!= 0)  
		{  
		int dig = squ % 10;  
		sum = sum + dig;  
		squ = squ / 10;  
		}  
		if(ne == sum)  
		System.out.println(ne + " is a Neon Number.");  
		else  
		System.out.println(ne + " is not a Neon Number.");  
		}  
		
	}
