package array_employees;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter employee's details :- ");
		System.out.println("Enter id: ");
		e.setId(scan.nextInt());
		scan.nextLine();
		System.out.println("Enter name: ");
		e.setName(scan.next());
		System.out.println("Enter the number of languages you know : ");
		String[] languages = new String[scan.nextInt()]; //array syntax..
		scan.nextLine();
		System.out.println("Enter the languages: ");
		for(int i=0;i<languages.length;i++) {
			languages[i]=scan.nextLine();
		}
		e.setLanguages(languages);
		e.print();
		

	}

}
