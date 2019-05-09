package jdbc_crud;

import java.sql.*;

public class DatabaseOpr {
	String tname;
	Connection con;
	Statement st;
	PreparedStatement ps;
	
	int id,salary;
	String empName;
	
	public DatabaseOpr() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded...");

		con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
		System.out.println("Connection established...");
	}	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	

	public void create() throws Exception {
		String qu = "create table Employee (id integer primary key,EmpName varchar(100) not null,Salary integer not null);";
		st = con.createStatement();
		st.executeUpdate(qu);
	}

	public void insert() throws Exception {
		
		String query = "insert into Employee values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2, empName);
		ps.setInt(3, salary);
		ps.executeUpdate();
	}

	public void update() throws Exception {
		String query = "update Employee set Empname=? where id=?;";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2, empName);
		ps.executeUpdate();
	}

	public void delete() throws Exception {
		String query = "delete from Employee where id =?;";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeUpdate();
	}

	public void show() throws Exception {
		st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from Employee;");

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getInt(3));
			
		}
	}
}
