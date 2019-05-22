package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class TestEmployee {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Employee e = new Employee();

		System.out.println("Enter id : ");
		e.setId(scan.nextInt());

		scan.nextLine();

		System.out.println("Enter Name : ");
		e.setName(scan.nextLine());

		System.out.println("Enter Salary : ");
		e.setSalary(scan.nextInt());

		System.out.println("Enter no. of certificates");
		int n = scan.nextInt();

		ArrayList<Certificates> certificates = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			Certificates c = new Certificates();

			System.out.println("Enter Certificate Id");
			c.setId(scan.nextInt());
			scan.nextLine();

			System.out.println("Enter Certificate Name");
			c.setName(scan.nextLine());

			System.out.println("Enter Certificate Grade");
			c.setGrade(scan.nextLine());
			
			certificates.add(c);
		}
		e.setCertificates(certificates);
		System.out.println(e);
	
	}
	

}
