package practices;

public class Employee {
	private String name;
	private int age;
	private String email;
	private int salary;
	private String department;
	
	
	
	public Employee() {
		super();
	}



	public Employee(String name, int age, String email, int salary, String department) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.salary = salary;
		this.department = department;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", email=" + email + ", salary=" + salary + ", department="
				+ department + "]";
	}
	
	
	
	
}
