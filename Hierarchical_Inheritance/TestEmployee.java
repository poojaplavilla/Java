package inheritance;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Employees information, select any one.");
		System.out.println("1.Permenant Employee \n2.Temporary Employee");
		int choice = scan.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Enter information of Permenant employee...");
			System.out.println("Enter id: ");
			int id = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter name: ");
			String name = scan.next();
			System.out.println("Enter basic: ");
			int basic = scan.nextInt();
			System.out.println("Enter da: ");
			int da = scan.nextInt();
			System.out.println("Enter hra: ");
			int hra = scan.nextInt();

			PermenantEmp pe = new PermenantEmp(id, name, basic);
			pe.CalSalary();
			pe.print();
			break;

		case 2:
			System.out.println("Enter information of Temporary employee...");
			System.out.println("Enter id: ");
			int idt = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter name: ");
			String namet = scan.next();
			System.out.println("Enter hours: ");
			int hrs = scan.nextInt();
			System.out.println("Enter payment: ");
			int payment = scan.nextInt();
			TemporaryEmp te = new TemporaryEmp(idt, namet, payment, hrs);
			te.CalSalary();
			te.print();
			break;

		default:
			System.out.println("INVALID CHOICE");
			break;

		}
	}
}
