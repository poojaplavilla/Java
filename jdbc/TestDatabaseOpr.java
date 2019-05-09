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
			System.out.println("Creating table...");
			dop.create();
			break;
		case 2:
			System.out.println("Inserting values...");
			dop.insert();
			break;
		case 3:
			System.out.println("Updating values...");
			dop.update();
			break;
		case 4:
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
