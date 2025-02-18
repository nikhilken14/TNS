package day10;

public class CovariantOverride {
	public static void main(String[] args) {
		Color c=new Color();
		System.out.println(c.getColor());
		
		Red r=new Red();
		System.out.println(r.getColor());
		
		Yellow y=new Yellow();
		System.out.println(y.getColor());
	}
}

class Color{
	protected Color getColor() {
		Color s=new Color();
		return s;
	}
}

class Red extends Color{
	protected Red getColor() {
		Red s=new Red();
		return s;
	}
}

class Yellow extends Color{
	protected Yellow getColor() {
		Yellow s=new Yellow();
		return s;
	}
}