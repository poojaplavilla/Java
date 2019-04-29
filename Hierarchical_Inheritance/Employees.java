package inheritance;

public class Employees {
	public int id;
	public String name;
	public float salary;
	public Employees() {
		
	}
	//These two variables are public and will be inheritated in both the child classes...
	public Employees(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//this method will get override by the child classes...
	void CalSalary() {
		
	}

	//printinh purpose... 
	void print() {
		System.out.println("...EMPLOYEE DETAILS...\n");
		System.out.println("Your id is " + id);
		System.out.println("Your name is " + name);
	}
	

}
