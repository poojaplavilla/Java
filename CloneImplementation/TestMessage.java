package clone;

public class TestMessage {

	public static void main(String[] args) throws CloneNotSupportedException {
		Message m = new Message("Pooja");
		Message m2 = (Message)m.clone();
		System.out.println(m2.getMsg());
		
	}

}


















