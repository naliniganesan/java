# java
code
package funoverloadnig.com;
class funcdatatype{
	
	void addition(int i,int j) {
		int s=i+j;
		System.out.println("the addition of int datatype"+s);
	}
	void addition(float i,float j) {
		float s=i+j;
		System.out.println("the addition of float datatype"+s);
	}
    void addition(double i,double j) {
			double s=i+j;
			System.out.println("the addition of double datatype"+s);
		}
    void addition(long i,long j) {
		long s=(long)i+j;
		System.out.println("the addition of long datatype"+s);
	}
    void addition(short i,short j) {
		short s=(short)(i+j);
		System.out.println("the addition of short datatype"+s);
	}
    void addition(byte i,byte j) {
		byte s=(byte)(i+j);
		System.out.println("the addition of byte datatype"+s);
	}
	
	
	
	
	
}
public class Functionoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funcdatatype ob=new funcdatatype();
		ob.addition(4, 7);
		ob.addition(3.5f, 5.7f);
		ob.addition(5, 6);
		ob.addition(189, 12);
		ob.addition((short)5, (short)8);
		ob.addition((byte)5, (byte)8);

	}

}
