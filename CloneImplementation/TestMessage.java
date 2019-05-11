package clone;

public class Message implements Cloneable {
	String msg;
	
	public Object clone() throws CloneNotSupportedException {
			System.out.println("Cloning...");
			return super.clone();
	}
		
}
