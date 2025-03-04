package day11;

public class StringDemo {
	public static void main(String[] args) {
		char[]c= {'I','n','d','i','a'};
		String s1=new String(c);
		System.out.println(s1);
		
		String s2=new String(s1);
		System.out.println(s2==s1);
		System.out.println(s2.equals(s1));
	}
}

