package inheritance;

public class Employees {
	public int id;
	public String name;
	public float salary;
	public Employees() {
		
	}
	public Employees(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void CalSalary() {
		
	}

	void print() {
		System.out.println("...EMPLOYEE DETAILS...\n");
		System.out.println("Your id is " + id);
		System.out.println("Your name is " + name);
	}
	

}
