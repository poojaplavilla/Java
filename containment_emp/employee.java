package containment_emp;

public class Employee {

	private int id;
	private String name;
	private float salary;
	private Certificate certificate;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, float salary, Certificate certificate) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.certificate = certificate;
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
	
	public float getSalary() {
		return salary;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public Certificate getCertificate() {
		return certificate;
	}
	
	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
	
	void print()
	{
		System.out.println("Employee details...");
		System.out.println("Your id : " + id);
		System.out.println("Your name : " + name);
		System.out.println("Your salary : " + salary);
		certificate.print();
	}

}
