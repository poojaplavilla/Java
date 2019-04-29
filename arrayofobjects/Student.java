package arraysofobjects;

public class Student {
	private int id;
	private String name;
	private float marks;
	
	//default constructor...
	public Student() {
		System.out.println("...ARRAY OF OBJECTS...");
	}
	
	//parameterized constructor...
	public Student(int id, String name, float marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	//getters and setters as instance variables are private...
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

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	//method...
	void printResult() {
		System.out.println("Details of student : -");
		System.out.println("Your id is: " + id);
		System.out.println("Your name is " + name);
		System.out.println("Obtained marks: " + marks);
	}

}
