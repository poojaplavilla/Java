package contactBook;

import java.util.Scanner;

public class MobMain {
	public static void main(String[] args) throws Exception {

		Mob m = new Mob();
		Scanner scan = new Scanner(System.in);

		System.out.println("...Database operations...");
		System.out.println("1.Create table\n2.Insert values\n3.Update values\n4.Delete values\n5.Show table");
		int choice = scan.nextInt();

		switch (choice) {
		case 1:
			// System.out.println("Enter table name: ");
			// dop.tname = scan.nextLine();
			// scan.nextLine();
			System.out.println("Creating table...");
			m.create();
			break;
		case 2:
			String ans;

			do {
				System.out.println("Enter id: ");
				m.setId(scan.nextInt());

				scan.nextLine();

				System.out.println("Enter First Name : ");
				m.setFname(scan.next());

				System.out.println("Enter Last Name : ");
				m.setLname(scan.next());

				System.out.println("Enter Mobile No.(1): ");
				m.setMob1(scan.nextInt());

				System.out.println("Enter Mobile No.(2): ");
				m.setMob2(scan.nextInt());

				scan.nextLine();

				System.out.println("Enter email address : ");
				m.setEmail(scan.next());

				m.insert();

				System.out.println("Do you want to insert other values: (y/n) ");
				scan.nextLine();
				ans = scan.nextLine();
			} while (ans.equals("y"));

			System.out.println("Inserting values...");

			break;
		case 3:
			System.out.println("Enter id: ");
			m.setId(scan.nextInt());
			scan.nextLine();
			System.out.println("Enter fname: ");
			m.setFname(scan.next());
			System.out.println("Updating values...");
			m.update();
			break;
		case 4:
			System.out.println("Enter id: ");
			m.setId(scan.nextInt());
			System.out.println("Deleting values...");
			m.delete();
			break;
		case 5:
			System.out.println("Showing your table...");
			m.show();
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
	}
}
