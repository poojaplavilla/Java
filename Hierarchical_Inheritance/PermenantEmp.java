package inheritance;

public class PermenantEmp extends Employees {
	public float basic;
	public float da,hra;
	
	
	//default constructor...
	public PermenantEmp() {
	
	}
	//id, string inheritated from parent class and we need basic to calculate da and hra...
	public PermenantEmp(int id, String name, float basic) {
		super(id,name); // inherit from parent class...
		this.basic = basic;
	}

	//overridden method...
	public void CalSalary() {
		da = 0.15f * basic;
		hra = 0.35f * basic;
		salary = basic + da + hra;
		
	}
	
	public  void print() {
		super.print(); // inherit from parent class...
		System.out.println("Salary for permenant Employee: " + salary);
		
	}

}
