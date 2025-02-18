package day10;

public class AbstractionDemo {
	public static void main(String[] args) {
		Shape s = new Rectangle();
		s.cal();
		s.show();
		
		
		Shape s1=new Square();
		s1.cal();
	}
}

abstract class Shape{
	
	public abstract void cal();
	
	public void show() {
		System.out.println("this is concrete method of abstract class");
	}
}

class Rectangle extends Shape{
	float width;
	float height;
	
	public Rectangle() {
		width=3.2f;
		height=2.0f;
	}
	
	public Rectangle(float width,float height) {
		this.width=width;
		this.height=height;
	}
	
	@Override
	public void cal() {
		System.out.println(width*height);
	}
	
}

class Square extends Shape{
	float width;
	
	public Square() {
		width=3.2f;
	}
	@Override
	public void cal() {
		System.out.println(width*width);
	}
	
}