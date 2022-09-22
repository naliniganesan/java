# java
code
ackage array.com;

import java.util.Scanner;

public class ArraySerach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]=new int[5];
		int schr,pos=-1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter "+ar.length+ "element");
		for(int i=0;i<ar.length;i++) 
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("array of schr");

		schr=sc.nextInt();
			 for(int i=0;i<ar.length;i++) {
		        	if(schr==ar[i]) {
		        		pos=i;
		        		break;
		        	}
		        }
		        if(pos>-1) {
		        	System.out.println("Successful search");
		        	System.out.println(schr+" element found at position "+(pos+1));
		        }else {
		        	System.out.println("Unsuccessful search");
		        	System.out.println(schr+" element not found");

		}
		
		
	
		
	}
