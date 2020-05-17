package entities;

public class Employee {
	
	private String name;
	private Double salary;
	private Integer id;
	
	public Employee(int id, String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}
	
	public void Incrementsalary(double percentage) {
		this.salary += this.salary*percentage/100;
	}
	
	public String toString() {
		return id
			+ ", "	
			+ name
			+ ", "
			+ salary;
	}
	

}
