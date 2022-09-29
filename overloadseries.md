# java
code
package funoverloadnig.com;

public class SeriesOverload {
	void series(int x,int n) {
		float sum=0;
		for(int i=1;i<=n;i++) {
			sum=(float)   (sum+Math.pow(x, i));
		}
		System.out.println("the no of series"+sum);
	}
    void series(int p) {
		int t=0;
		for(int i=1;i<=p;i++) {
			t=(i*i*i)-1;
			System.out.println(t+" ");
		}
	      System.out.println();
	}
     void series() {
	float sum=0;
	for(int i=2;i<=9;i++) {
		sum=sum+(float)1/i; 
	}
	System.out.println("sum of the given series ="+sum);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeriesOverload ob=new SeriesOverload();
		ob.series(); ////1/2 + 1/3 + 1/4 +1/5+1/6+1/7+1/8+/1/9+ 1/10.
		ob.series(10);  ////0,7,26,63,124,..........p terms
		ob.series(2,10);//x1 + x2 + x3 + … + xn terms
	}

}
