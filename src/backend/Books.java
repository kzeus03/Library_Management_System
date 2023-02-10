package backend;
import java.sql.*;
public class Books {
	String url="jdbc:mysql://localhost:3306/libraryManagement";
	String uname="root";
	String pass="9711";
	
	
	public void getBookList() throws ClassNotFoundException, SQLException {
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		String Query="select name from books";
		ResultSet rs=st.executeQuery(Query);
		while(rs.next()) {
			String name=rs.getString("name");
			System.out.println(name);
		}
		st.close();
		con.close();
		
	}
	
	public void searchBook(String name) throws SQLException {
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		String Query="select * from books where name='"+name+"'";
		ResultSet rs=st.executeQuery(Query);		
		while(rs.next()) {
			String bname=rs.getString("name");
			int version=rs.getInt("version");
			int quantity=rs.getInt("quantity");
			System.out.println("Book Name : "+bname+" Version : "+version+" Quantity : "+quantity);
		}
		if(!rs.next()) {
			System.out.println("No data found");
		}
		st.close();
		con.close();
	}
	
	
	public void insertBookData(String name,int version,int quantity) throws SQLException {
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		String Query="insert into books(name,version,quantity) values('"+name+"',"+version+","+quantity+")";
		int count=st.executeUpdate(Query);
		System.out.println(count+" rows updated");
		st.close();
		con.close();		
	}
	
	public void deleteBookData(String name) throws SQLException {
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		String Query="delete from books where name='"+name+"'";
		int count=st.executeUpdate(Query);
		System.out.println(count+" rows deleted");
		st.close();
		con.close();
	}
	
	public void updateBookName(String oldname,String newname) throws SQLException {
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		String Query="update books set name='"+newname+"' where name='"+oldname+"'"; 
		int count=st.executeUpdate(Query);
		System.out.println(count+" rows updated");
		st.close();
		con.close();
	}
	
	public void updateBookVersion(String bookName,int newversion) throws SQLException {
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		String Query="update books set version='"+newversion+"' where name='"+bookName+"'"; 
		int count=st.executeUpdate(Query);
		System.out.println(count+" rows updated");
		st.close();
		con.close();
	}
	
	public void updateBookQuantity(String bookName,int quantity) throws SQLException {
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		String Query="update books set quantity='"+quantity+"' where name='"+bookName+"'"; 
		int count=st.executeUpdate(Query);
		System.out.println(count+" rows updated");
		st.close();
		con.close();
	}
	
}
