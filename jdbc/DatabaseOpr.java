package jdbc_crud;

import java.sql.*;

public class DatabaseOpr {
	Connection con;
	Statement st;

	public DatabaseOpr() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded...");

		con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
		System.out.println("Connection established...");
	}

	public void create() throws Exception {
		String qu = "create table Employee(id integer primary key,EmpName varchar(100) not null,Salary integer not null);";
		st = con.createStatement();
		st.executeUpdate(qu);
	}

	public void insert() throws Exception {
		String qu = "insert into Employee values (1,'abc',123456);";
		st = con.createStatement();
		st.executeUpdate(qu);
	}

	public void update() throws Exception {
		String qu = "update Employee set Empname='xyz' where id=1;";
		st = con.createStatement();
		st.executeUpdate(qu);
	}

	public void delete() throws Exception {
		String qu = "delete from Employee where id = 1";
		st = con.createStatement();
		st.executeUpdate(qu);
	}

	public void show() throws Exception {
		st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from Employee;");

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getInt(3));
			
		}
	}
}
