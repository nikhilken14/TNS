package Day9;

public class FinalDemo {
	// final value can not be changed 
	final int x=10;
	
	final static int y;
	
	final static int z=14;
	
	void chnge() {
		//y=10;
	}
	
	static {
		y=20;
	}

	@Override
	public String toString() {
		return "FinalDemo [x=" + x +", y="+y+ "]";
	}

	final void show() {
		System.out.println("this method cannot be overrided .");
	}
	
	public static void main(String[] args) {
		FinalDemo f=new FinalDemo();
		System.out.println(f.toString());
		f.show();
		
		DemoFinal d=new DemoFinal();
		d.show();
	}
}

// final class can not be extended but we can create object of it
final class DemoFinal{
	void show() {
		System.out.println("this is final class");
	}
}
