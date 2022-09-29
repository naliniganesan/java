# java
code
package funoverloadnig.com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Fibonacci{
	int n1,n2,n3,term;
	Fibonacci(){
		n1=0;
		n2=1;
	}
void inputData() throws IOException {
	InputStreamReader is=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number of terms");
	term=Integer.parseInt(br.readLine());
	
}
void generatesFibonacci() {
	System.out.println("Fibonacci series");
	System.out.println(n1);
	System.out.println(n2);
	for(int  i=1;i<=term-2;i++) {
		 n3=n1+n2;
		 System.out.println(n3);
		 n1=n2;
		 n2=n3;
	 }
}
}	
public class FboniccClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Fibonacci ob=new Fibonacci();
		ob.inputData();
		ob.generatesFibonacci();
		
	}
	}
