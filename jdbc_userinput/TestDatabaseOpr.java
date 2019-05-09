package jdbc_crud;
import java.sql.*;
import java.util.Scanner;

public class TestDatabaseOpr {

	public static void main(String[] args) throws Exception {
		
		
		DatabaseOpr dop = new DatabaseOpr();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("...Database operations...");
		System.out.println("1.Create table\n2.Insert values\n3.Update values\n4.Delete values\n5.Show table");
		int choice = scan.nextInt();
		
		switch (choice) {
		case 1:
			//System.out.println("Enter table name: ");
			//dop.tname = scan.nextLine();
			//scan.nextLine();
			System.out.println("Creating table...");
			dop.create();
			break;
		case 2:
			String ans;
			
			do {
			System.out.println("Enter id: ");
			dop.setId(scan.nextInt());
			scan.nextLine();
			System.out.println("Enter EmpName: ");
			dop.setEmpName(scan.next());
			System.out.println("Enter Salary: ");
			dop.setSalary(scan.nextInt());
			dop.insert();
			System.out.println("Do you want to insert other values: (y/n) ");
			scan.nextLine();
			ans = scan.nextLine();
			}while(ans.equals("y"));			
			
			System.out.println("Inserting values...");
			
			break;
		case 3:
			System.out.println("Enter id: ");
			dop.setId(scan.nextInt());
			scan.nextLine();
			System.out.println("Enter EmpName: ");
			dop.setEmpName(scan.next());
			System.out.println("Updating values...");
			dop.update();
			break;
		case 4:
			System.out.println("Enter id: ");
			dop.setId(scan.nextInt());
			System.out.println("Deleting values...");
			dop.delete();
			break;
		case 5:
			System.out.println("Showing your table...");
			dop.show();
			break;
		default:
			System.out.println("Invalid option");
			break;	
	}

}
}
