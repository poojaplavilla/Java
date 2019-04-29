package interfaces;

public class Printer implements Printable {
	int a;
	public void print() {
		System.out.println("Hello...!!!");
	}

	public void print(int a) {
		this.a =a;
		System.out.println("hie " + a);
	}
}
