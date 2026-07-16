package basic.step15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 *	JDBC
 *	자바 프로그램에서 DB에 접속하고 SQL을 실행하기 위한 표준 API. 
 */

public class MainClass01 {
	public static void main(String[] args) {
		//Connection 객체: 자바와 DB를 연결.
		Connection conn = null;
		
		try {
			//오라클 드라이버 로드.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 정보.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			//계정 정보로 접속.
			conn = DriverManager.getConnection(url, "scott", "tiger");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//PreparedStatement 객체: SQL을 DB에 보낼 준비를 하는 객체.
		PreparedStatement pstmt = null;
		//ResultSet 객체: SELECT 문의 결과를 저장하는 객체.
		ResultSet rs = null;
		
		try {
			String sql = "SELECT num, name, addr FROM member ORDER BY num DESC";
			//SQL 실행 준비.
			pstmt = conn.prepareStatement(sql);
			//SQL 실행.
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//객체들을 닫아줘야 한다.
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
