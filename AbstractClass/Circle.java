package abstractclass;

public class Circle extends Shape {
	float radius;
	
	public void Cal()
	{
		area = 3.114f * radius * radius;
	}
	public void print() {
		System.out.println("Radius is " + radius);
		super.print();
	}
	

}
