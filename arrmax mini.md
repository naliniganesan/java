# java
code
package array.com;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {4,6,7,8};
		 int max=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
        	max=ar[i];
			}
	    }
        System.out.println("max of array="+max);
		 int min=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<min) {
       	min=ar[i];
			}
	    }
       System.out.println("max of array="+min);
       
	}

}
 
