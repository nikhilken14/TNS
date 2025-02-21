package day11;

public class MarkarInterfaceDemo {
	public static void main(String[] args) {
		Employee emp = new Employee("John Doe", 101);

        if (emp instanceof Identifiable) {
            System.out.println(emp.getName() + " is identifiable.");
        } else {
            System.out.println(emp.getName() + " is not identifiable.");
        }
	}
}

interface Identifiable {
    
}

class Employee implements Identifiable {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}