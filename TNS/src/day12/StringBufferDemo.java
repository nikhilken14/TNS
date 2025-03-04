package day12;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		// String buffer length vs capacity
		
		StringBuffer buf=new StringBuffer("Hello");
		System.out.println(buf);
		System.out.println(buf.length());
		System.out.println(buf.capacity());
		
		buf=new StringBuffer("I like java!");
		System.out.println(buf.reverse());
		
	}
}
