# java
code
package volwes;

import java.util.Scanner;

public class VolwesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char ch;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ur choice");
			ch = sc.next().charAt(0);
			switch(ch) {
			case 'a': System.out.println("a is volwes");
			         break;
			case 'e': System.out.println("e is volwes");            
			        break;
			case 'i': System.out.println("i is volwes");
					break;
	        case 'o': System.out.println("o is volwes");            
	        		break;
	        case 'u':System.out.println("u is volwes");
	               break;
	        case 'A':System.out.println("A is notvolwes");
	            
	        break;
	       
	               
	       default:System.out.println("Invalid input");
			        
			}

	}

}
