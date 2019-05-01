package array_employees;

public class Employee {
	private int id;
	private String name;
	private String[] languages;
	public Employee() {
		
	}
	public Employee(int id, String name, String[] languages) {
		this.id = id;
		this.name = name;
		this.languages = languages;
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
	public String[] getLanguages() {
		return languages;
	}
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	
	public void print() {
		System.out.println("Employee details...");
		System.out.println("Your id : " + id);
		System.out.println("Your name : " + name);
		System.out.println("Languages you know : ");
		for(int i=0;i<languages.length;i++) {
			System.out.println(languages[i]);
		}
	}

}
