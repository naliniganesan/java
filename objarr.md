# java
code
package array.com;

import java.util.Scanner;

public class Arrayuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float ar[]=new float[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter "+ar.length+ "element");
		for(int i=0;i<ar.length;i++) 
		{
			ar[i]=sc.nextFloat();
		}
		System.out.println("array of element");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
	    }
       //displaying purpose enhanced for loop or for-each
		System.out.println("Using enhanced for loop display array elements");
		for(float i:ar) { //syntax:   for(datatype varname:name_of_the_array)
			System.out.println(i);
		}
	}

}
