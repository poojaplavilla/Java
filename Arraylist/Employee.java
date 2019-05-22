package arraylist;

import java.util.ArrayList;

public class Employee {

	int id;
	String name;
	int salary;
	private ArrayList<Certificates> certificates; //need to create a class of whatever written in <>...
	public Employee() {
		super();
	}
	
	public Employee(int id,String name, int salary, ArrayList<Certificates> certificates) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.certificates = certificates;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public ArrayList<Certificates> getCertificates() {
		return certificates;
	}

	public void setCertificates(ArrayList<Certificates> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", certificates=" + certificates + "]";
	}
}
