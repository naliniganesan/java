# java
code
package swithcase.com;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur month");
		month = sc.next();
		switch(month) {
		case  "jan": System.out.println("frist year of month");
		         break;
		case "feb": System.out.println("second year of month");            
		        break;
		case "march": System.out.println("thrid year of month");
				break;
        case "april": System.out.println("fourth year of month");            
        		break;
        case "may":System.out.println("five year of month");
               break;
        case "june":System.out.println("six year of month");
        break;
        case "july":System.out.println("seven year of month");
        break;
        case "aug":System.out.println("eigth year of month");
        break;
        case "step":System.out.println("ninth year of month");
        break; 
        case "oct":System.out.println("tenth year of month");
        break;
        case "nov":System.out.println("elveth year of month");
        break;
        case "dec":System.out.println("twelveth year of month");
        break;
       default:System.out.println("Invalid input");
		        
		}
	}
}


