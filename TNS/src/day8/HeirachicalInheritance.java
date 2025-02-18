package day8;

public class HeirachicalInheritance {
	public static void main(String[] args) {
		
	}
}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}

class Student3 extends Person{
    private int studentId;
    private String course;

    public Student3(String name, int studentId, String course) {
        super(name); 
        this.studentId = studentId;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStudent ID: " + studentId + "\nCourse: " + course;
    }
}

class Employee extends Person{
	private int employeeId;
    private String department;

    public Employee(String name, int employeeId, String department) {
        super(name); 
        this.employeeId = employeeId;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmployee ID: " + employeeId + "\nDepartment: " + department;
    }
}