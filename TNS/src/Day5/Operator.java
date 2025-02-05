package Day5;

public class Operator {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		// increment -> a++
		// post increment -> a++ 
		// pre-increment -> ++a
		
		// decrement -> b--
		// post increment -> b--
		// pre-increment -> --b
		
		++a;
		b--;
		++a;
		System.out.println(a+b);
	}
}
