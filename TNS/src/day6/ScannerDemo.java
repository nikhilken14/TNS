package day6;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Name=sc.nextLine();
		int age=sc.nextInt();
		String Gender =sc.nextLine();
		double income=sc.nextDouble();
		
		Person p=new Person();
		Tax t=new Tax();
		
		p.setName(Name);
		p.setAge(age);
		p.setGender(Gender);
		p.setIncome(income);
		
		t.calcuate(p);
	}
}

class Person{
	private int age;
	private String Name;
	private String Gender;
	private double income;
	private double tax;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
}

class Tax{
	
	public void calcuate(Person p) {
		if(p.getAge()>65 || p.getGender().equalsIgnoreCase("female")) {
			p.setTax(0.0);
		}
		else {
			if(p.getIncome()<=200000) {
				p.setTax(0.0);
			}
			else if(p.getIncome()>200000 && p.getIncome()<=500000) {
				p.setTax((p.getIncome()-200000)*10/100);
			}
			else if(p.getIncome()>500000 && p.getIncome()<=800000) {
				p.setTax((p.getIncome()-500000)*20/100+30000);
			}
			else {
				p.setTax((p.getIncome()-200000)*30/100+90000);
			}
		}
	}
}