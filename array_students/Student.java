package array_students;

public class Student {
	private int id;
	private String name;
	private int[] marks;
	public Student() {
		super();
	}
	public Student(int id, String name, int[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	public void print() {
		System.out.println("Employee details...");
		System.out.println("Your id : " + id);
		System.out.println("Your name : " + name);
		System.out.println("Marks you have obtained: ");
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
	}

}
