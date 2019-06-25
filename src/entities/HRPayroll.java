package entities;

public class HRPayroll {
	
	private int id;
	private String name;
	private double salary;
	
	public HRPayroll(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary (double percentage) {
		this.salary*=1+percentage/100;
	}

	public  String toString() {
		return id
				+" "
				+name
				+" $"
				+salary;
		
	}
}
