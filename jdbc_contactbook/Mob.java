package contactBook;

import java.sql.*;

public class Mob {
	int id;
	String fname, lname, email;
	int mob1, mob2;

	Connection con;
	Statement st;
	PreparedStatement ps;

	public Mob() throws Exception {
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

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getMob1() {
		return mob1;
	}

	public void setMob1(int mob1) {
		this.mob1 = mob1;
	}

	public double getMob2() {
		return mob2;
	}

	public void setMob2(int mob2) {
		this.mob2 = mob2;
	}

	public void create() throws Exception {
		String qu = "create table ContactBook (id integer primary key,fname varchar(100) not null,lname varchar(100) not null,mob1 varchar(13) not null unique,mob2 varchar(13), email varchar(100) not null unique);";
		st = con.createStatement();
		st.executeUpdate(qu);
	}

	public void insert() throws Exception {

		String query = "insert into ContactBook values(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2, fname);
		ps.setString(3, lname);
		ps.setDouble(4, mob1);
		ps.setDouble(5, mob2);
		ps.setString(6, email);

		ps.executeUpdate();
	}

	public void update() throws Exception {
		String query = "update ContactBook set fname=? where id=?;";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2, fname);
		ps.executeUpdate();
	}

	public void delete() throws Exception {
		String query = "delete from ContactBook where id =?;";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeUpdate();
	}

	public void show() throws Exception {
		st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from ContactBook;");

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getInt(4) + "," + rs.getInt(5) + ","  + rs.getString(6));

		}
	}
}
