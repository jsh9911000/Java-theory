package basic.step15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	//필드.
	private Connection conn;
	
	//생성자.
	public DBConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	//메소드.
	public Connection getConn() {
		return conn;
	}
}
