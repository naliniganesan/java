# java
code
package loopsta.com;

public class Fabiocc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10, first = 0, second = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(first + ", ");
	      int nextTerm = first + second;
	      first = second;
	      second = nextTerm;
	    }
	  }
	
	}


