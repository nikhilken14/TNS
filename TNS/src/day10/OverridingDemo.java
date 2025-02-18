package day10;

public class OverridingDemo {
	public static void main(String[] args) {
		RBI r;
		// dynamic binding 
		r=new RBI();
		System.out.println(r.getRateOfInterest());
		
		r=new SBI();
		System.out.println(r.getRateOfInterest());
		
		r=new ICICI();
		System.out.println(r.getRateOfInterest());
	}
}
