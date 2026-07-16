package basic.step15.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MainClass04 {
	public static void main(String[] args) {
		//삭제할 회원의 번호 
		int num = 806;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag=0;
		try {
			conn = new DBConnect().getConn();
			String sql = "DELETE FROM member WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			flag = pstmt.executeUpdate();
			System.out.println("DELETE 문 수행 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			System.out.println("작업(DELETE) 성공");
		}else {
			System.out.println("작업(DELETE) 실패");
		}
	}

}
