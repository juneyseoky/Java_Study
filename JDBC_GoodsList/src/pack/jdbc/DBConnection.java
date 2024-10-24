package pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	protected Connection dbconn;
	
	public DBConnection(){
		DBConn();
	}

	public void DBConn() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/stock_Mgr?";
			   url += "useSSL=false&";
			   url += "characterEncoding=utf8&";
			   url += "useUnicode=true&";
			   url += "serverTimezone=Asia/Seoul&";
			   url += "allowPublicKeyRetrieval=true";
			String uid = "root";
			String upw = "1234";
			dbconn = DriverManager.getConnection(url, uid, upw);
		} catch(ClassNotFoundException e) {
			System.out.println("CNFE : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQLE : " + e.getMessage());
		}
	}
	
	public void mthCrud() {}
}
