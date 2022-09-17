# java
code
import java.util.Scanner;

public class largestofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        System.out.println("ENTER THREE NUMBERS "); 
		        Scanner in= new Scanner (System.in);
		        int x,y,z;
		        x=in.nextInt ();
		        y=in.nextInt ();
		        z=in.nextInt ();
		        
		        if (x>y && x>z)
		        System.out.println("FIRST NUMBER IS LARGEST");
		        else if (y>x && y>z)
		        System.out.println("SECOND NUMBER IS LARGEST");
		        else
		        {
		        System.out.println("THIRD NUMBER IS LARGEST");
		        }
		    
		   
		      }
}
