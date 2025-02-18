package day8;

public class SingleInheritance {
	public static void main(String[] args) {
		Student s = new Student("John Doe", "1234-5678-9101", "Pune", 9876543210L, 101, "Pune University");
		System.out.println(s);;
	}
}

class Citizen{
	private String Name;
	private String AadharNo;
	private String Address;
	private long Phone;
	
	
	public Citizen(String name, String aadharNo, String address, long phone) {
		this.Name = name;
		this.AadharNo = aadharNo;
		this.Address = address;
		this.Phone = phone;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAadharNo() {
		return AadharNo;
	}
	public void setAadharNo(String aadharNo) {
		AadharNo = aadharNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	
	@Override
	public String toString() {
		return "Citizen [Name=" + Name + ", AadharNo=" + AadharNo + ", Address=" + Address + ", Phone=" + Phone + "]";
	}		
}

class Student extends Citizen{
	private int rollNo;
	private String CollegeName;
	
	public Student(String name, String aadharNo, String address, long phone,int rollNo, String collegeName) {
		super(name, aadharNo, address, phone);
		this.rollNo = rollNo;
		this.CollegeName = collegeName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}	
	
	 @Override
	 public String toString() {
	        return super.toString() + ", Student [RollNo=" + rollNo + ", CollegeName=" + CollegeName + "]";
	 }
}