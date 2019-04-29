package innerclasses;
import java.util.Scanner;

public class TestCoffee {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		CoffeeShop cs = new CoffeeShop("Baroda",20); //creating object of Outer class...
		
		//Creating object of Inner class...
		//OuterClass.InnerClass obj_of_innerclass = obj_of_outerclass.new InnerClass();
		CoffeeShop.CafeCoffeeDay ccd = cs.new CafeCoffeeDay("Black Coffee",100);
		
		cs.printCD();
		ccd.printCCD();
		
		CoffeeShop csh = new CoffeeShop();
		System.out.println("Enter place: ");
		csh.setPlace(scan.next());
		scan.nextLine();
		System.out.println("Enter capacity");
		csh.setCapacity(scan.nextInt());
		
		CoffeeShop.CafeCoffeeDay ccda = cs.new CafeCoffeeDay();
		System.out.println("Enter name of coffee: ");
		ccda.setCoffeeName(scan.next());
		scan.nextLine();
		System.out.println("Enter price: ");
		ccda.setPrice(scan.nextInt());
		
		csh.printCD();
		ccda.printCCD();
		
		

	}

}
