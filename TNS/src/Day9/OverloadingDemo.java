package Day9;

public class OverloadingDemo {
	public static void main(String[] args) {
		System.out.println(OverLoad.add(4,5));;
		System.out.println(OverLoad.add(3.5f, 3.4f));;
		System.out.println(OverLoad.add(3,3,4));;
	}
}

class OverLoad{
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public static float add(float a,float b) {
		return a+b;
	}
}