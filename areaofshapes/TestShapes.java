package areaofshapes;

import java.util.Scanner;

public class TestShapes {
	public static void main(String[] args) {
		Shapes shapes = new Shapes();
		Scanner scan = new Scanner(System.in);
		System.out.println("...SHAPES...");
		System.out.println("Enter the number whose area you want to calculate:");
		System.out.println("1.Circle\n2.Rectangle\n3/Square");
		int choice = scan.nextInt();

		switch (choice) {
		case 1:
			System.out.println("...Cirlce...");
			System.out.println("Enter the radius of the circle: ");
			shapes.rad = scan.nextFloat();
			shapes.c_area(3);
			break;
		case 2:
			System.out.println("...Rectangle...");
			System.out.println("Enter the length and breadth of the rectangle: ");
			shapes.len = scan.nextFloat();
			shapes.bre = scan.nextFloat();
			shapes.r_area(5,4);
			break;

		case 3:
			System.out.println("...Square...");
			System.out.println("Enter the side of the square: ");
			shapes.side = scan.nextFloat();
			shapes.s_area(4);
			break;

		default:
			System.out.println("Invalid choice...");
			break;

		}
	}
}
