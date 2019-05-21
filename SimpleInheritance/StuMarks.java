package simpleinheritance;

public class StuMarks extends Student {
	int i;
	float[] marks;
	float total_marks = 0;
	float per;

	public StuMarks() {
		super();
	}

	public StuMarks(int roll_no, String name, float[] marks) {
		super(roll_no, name);
		this.marks = marks;
		this.per = per;
	}

	public void CalMarks() {
		for (i = 0; i < marks.length; i++) {
			total_marks += marks[i];
		}
		per = (total_marks / marks.length);
	}

	public void print() {
		super.print();
		System.out.println("Marks you have obtained: ");
		for (i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		System.out.println("Total marks obtained : " + total_marks);
		System.out.println("Percentage obtained : " + per);
	}

}
