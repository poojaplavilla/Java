package clone;

public class Message implements Cloneable {
	private String msg;
	
	public Message() {
		super();
	}

	public Message(String msg) {
		super();
		this.msg = msg;

	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

		public Object clone() throws CloneNotSupportedException {
			System.out.println("Cloning...");
			return super.clone();
	}
		
}
