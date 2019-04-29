package inheritance;

public class TemporaryEmp extends Employees {
	public float payment, hrs;

	//default constructor...
	public TemporaryEmp() {
		
	}
	//id and string inheritated from parent class...
	public TemporaryEmp(int id, String name, float payment, float hrs) {
		super(id, name);
		this.payment = payment;
		this.hrs = hrs;
	}
	//overridden from parent class...
	public void CalSalary() {
		salary = hrs * payment;

	}

	public void print() {
		super.print();
		System.out.println("Salary for temporary Employee: " + salary);

	}

}
