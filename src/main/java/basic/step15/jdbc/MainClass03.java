package basic.step15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass03 {
	public static void main(String[] args) {
		int num = 804;
		String addr = "노량진";
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@14.63.164.99:1521:xe";
			conn = DriverManager.getConnection(url, "acorn01", "tiger01");
			System.out.println("Oracle DB 접속 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		PreparedStatement pstmt = null;
		int flag=0;
		
		try {
			String sql = "UPDATE member "
					+ " SET addr=?"
					+ " WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, addr);
			pstmt.setInt(2, num);
			flag = pstmt.executeUpdate();
			System.out.println("회원 정보를 수정 했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {}
		}
		if(flag > 0) {
			System.out.println("작업(UPDATE) 성공");
		}else {
			System.out.println("작업(UPDATE) 실패");
		}		
	}

}
