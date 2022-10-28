# java
code
package swithcase.com;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int num = 0;

	    System.out.println("Enter integer number: ");
	    num = sc.nextInt();

	    switch (num % 2) {
	    case 0:
	      System.out.println("Even number");
	      break;

	    case 1:
	      System.out.println("Odd number");
	      break;
	    }
	   
	}

}
