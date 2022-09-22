# java
code
package array.com;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[]= new int[5];
		
		int ar2[]= new int[5];
		System.out.println(" array1=");
		Scanner sc = new Scanner(System.in);
		 for (int i = 0; i < ar1.length; i++) {     
			 ar1[i]=sc.nextInt();     
	        } 
		 for (int i = 0; i < ar1.length; i++) {     
			 ar2[i]=ar1[i];     
	        } 
		 
		 System.out.println("copy of array=");
		 for(int i:ar2) {
	        	System.out.println(i);
	        }
		 
	}

}
