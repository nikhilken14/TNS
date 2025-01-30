package Day4;

public class TypeCasting {
	public static void main(String[] args) {
		
		// widening - Implicit Type Casting
		byte b=10;
		int i=b;
		System.out.println(i);
		
		float f=100/3f;
		double d=f;
		System.out.println(d);
		
		char ch='A';
		int i2=ch;
		System.out.println(i2);
		
		// narrowing  - explicit type casting
	
		double f1=10.52;
		long l=(long) f1;
		System.out.println(l);
		
		long abc=987632245656776L;
		int i21=(int)abc;
		System.out.println(i21);
		
		int xy=130;
		byte by=(byte)xy;
		System.out.println(by);
	}
}
