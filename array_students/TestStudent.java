package array_students;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		
		Student s = new Student();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter student's details :- ");
		System.out.println("Enter id: ");
		s.setId(scan.nextInt());
		scan.nextLine();
		System.out.println("Enter name: ");
		s.setName(scan.next());
		System.out.println("Enter the number of subjects : ");
		int[] marks = new int[scan.nextInt()];
		System.out.println("Marks: ");
		for(int i=0;i<marks.length;i++ ) {
			marks[i] = scan.nextInt();
		}
		s.setMarks(marks);
		s.print();
	}
}
