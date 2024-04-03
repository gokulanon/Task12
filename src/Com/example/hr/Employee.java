package Com.example.hr;

public class Employee {
	
	private String name;
    private Integer id;
    private double salary;

    public Employee(String name, Integer id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void printName() {
        System.out.println("Employee Name: " + name);
    }

    public void printSalary() {
        System.out.println("Employee Salary: " + salary);
    }
}

