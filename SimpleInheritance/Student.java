package simpleinheritance;

public class Student {
	
	int roll_no;
	String name;
	
	public Student() {
	
	}
	
	public Student(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}
	
	public void CalMarks() {
		
		}
		
	public void print() {
		System.out.println("Entered roll no. : " + roll_no);
		System.out.println("Entered name : " + name);
	}
}
