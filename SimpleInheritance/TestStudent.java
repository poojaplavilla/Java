package simpleinheritance;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter roll_no of the student: ");
		int roll_no = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name of the student : ");
		String name = sc.next();
		
		System.out.println("Enter the number of subjects : ");
		float[] marks = new float[sc.nextInt()];
		System.out.println("Enter the marks: ");
		for(int i=0;i<marks.length;i++ ) {
			marks[i] = sc.nextInt();
		}
			
		StuMarks sm = new StuMarks(roll_no, name, marks);
		sm.CalMarks();
		sm.print();
		
	}

}
