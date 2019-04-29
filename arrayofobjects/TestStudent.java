package arraysofobjects;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //to take input from user...
		
		System.out.println("Enter number of students:"); //next 3 lines will be used in "for" loop...
		int n = scan.nextInt();
		Student[] st = new Student[n]; //Creating an empty array...
		
		for(int i = 0; i< st.length; i++) {
			st[i] = new Student(); // initialized the array.. empty to blank (eg: blackboard)
	
			System.out.println("Enter id: ");
			st[i].setId(scan.nextInt());
			System.out.println("Enter name: ");
			scan.nextLine();
			st[i].setName(scan.next());
			System.out.println("Enter marks: ");
			st[i].setMarks(scan.nextFloat());
			
			st[i].printResult();
		}
	}

}

