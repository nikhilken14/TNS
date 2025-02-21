package day11;

public class NestedInterfaceDemo implements Outer ,Outer.Inner {

	@Override
	public void show() {
		System.out.println("hi inner");
	}

	@Override
	public void print() {
		System.out.println("hi outer");
	}
	
	public static void main(String[] args) {
		NestedInterfaceDemo i=new NestedInterfaceDemo();
		i.print();
		i.show();
	}
}

interface Outer{
	void print();
	interface Inner{
		void show();
	}
}