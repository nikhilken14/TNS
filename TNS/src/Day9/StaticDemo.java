package Day9;

public class StaticDemo {
	public static void main(String[] args) {
		Empl e=new Empl("nikhil");
		System.out.println(e);
	}
}

class Empl{
	private String Name;
	static String com="TNS";
	
	public Empl(String Name) {
		this.Name=Name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Empl [Name : " + Name + " , Company : "+com+"]";
	}
}