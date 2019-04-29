package interfaces;

public class TestPrint {

	public static void main(String[] args) {
		Printable p = new Printer();
		p.print(5);
		
		Printer pr = new Printer();
		p.print();

	}

}
