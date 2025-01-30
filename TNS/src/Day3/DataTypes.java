package Day3;

public class DataTypes {
	public static void main(String[] args) {
		
		// Byte - 1 Byte
		byte bytemax=127;
		byte bytemin=-127;
		System.out.println("Byte max : "+bytemax);
		System.out.println("Byte min : "+bytemin);
		
		
		// Short - 2 Byte 
		short shortmin=-32768;
		short shortmax=32767;
		System.out.println("Short max : "+shortmax);
		System.out.println("Short min : "+shortmin);
		
		// Integer  - 4 Byte 
		int intmin=-2147483648;
		int intmax=2147483647;
		System.out.println("Integer max : "+intmax);
		System.out.println("Integer min : "+intmin);
		
		// Long - 8 Byte
		long longmin=-9223372036854775808L;
		long longmax=9223372036854775807L;
		System.out.println("Long max : "+longmax);
		System.out.println("Long min : "+longmin);
		
		float example=22/7;
		System.out.println(example);
		
		double example2=22/7;
		System.out.println(example2);
		
		char name=65;
		System.out.println(name);		
		
	}
}
