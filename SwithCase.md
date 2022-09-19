# java
code
package swithcase.com;

import java.util.Scanner;

public class SwithCase{

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any int value between 1 to 5");
		num = sc.nextInt();
		switch(num) {
		case 1: System.out.println("One");
		         break;
		case 2: System.out.println("two");            
		        break;
		case 3: System.out.println("three");
				break;
        case 4: System.out.println("four");            
        		break;
        case 5:System.out.println("Five");
               break;
       default:System.out.println("Invalid input");
		        
		}

	}
