package calculator;
import java.util.Scanner;

public class TestCalculator {
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator(); //created object of class Calculator... c=reference(name of object),new Calculator()=object...
		Scanner scan = new Scanner(System.in); //for user input
		
		System.out.println("...CALCULATOR...");
		System.out.println("Please enter the number from the available options: ");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		int choice = scan.nextInt(); //User input
		
		switch(choice) {
		
		case 1:
			System.out.println("...Addition...");
			System.out.println("Enter num1: ");
			c.num1 = scan.nextFloat();
			System.out.println("Enter num2: ");
			c.num2 = scan.nextFloat();
			c.add();
			break;
			
		case 2:
			System.out.println("...Subtraction...");
			System.out.println("Enter num1: ");
			c.num1 = scan.nextFloat();
			System.out.println("Enter num2: ");
			c.num2 = scan.nextFloat();
			c.sub();
			break;
			
		case 3:
			System.out.println("...Multiplication...");
			System.out.println("Enter num1: ");
			c.num1 = scan.nextFloat();
			System.out.println("Enter num2: ");
			c.num2 = scan.nextFloat();
			c.mul();
			break;
			
		case 4:
			System.out.println("...Division...");
			System.out.println("Enter num1: ");
			c.num1 = scan.nextFloat();
			System.out.println("Enter num2: ");
			c.num2 = scan.nextFloat();
			c.div();
			break;
		
		default:
			System.out.println("INVALID CHOICE");
			break;
			
		}
	
		
	}


}
