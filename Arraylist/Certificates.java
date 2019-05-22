package arraylist;

public class Certificates {
	private int id;
	private String name;
	private String grade;
		
	public Certificates() {
		super();
	}

	public Certificates(int id, String name, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Certificates [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
}
