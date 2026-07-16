package basic.step15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass02 {
	public static void main(String[] args) {
		//아래의 정보를 member  테이블에 저장하고자 한다.
		String name="톰캣";
		String addr="건물 옥상";
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB 접속 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		PreparedStatement pstmt = null;
		//성공 여부를 저장할 변수.
		int flag = 0;
		
		try {
			//SQL를 문자열로 이어서 쓸때는 띄워써야 한다.
			String sql="INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";
			pstmt=conn.prepareStatement(sql);
			// ? 에 순서대로 값을 바인딩 하기 
			pstmt.setString(1, name); 
			pstmt.setString(2, addr); 
			//완성된 sql 문을 수행하고 변화된 row 의 갯수를 리턴 받는다. insert문은 executeUpdate();
			//수정된 row의 개수가 flag에 대입된다. ex)1줄의 row면 flag에 1이 들어간다.
			flag=pstmt.executeUpdate();
			System.out.println("회원 정보를 저장 했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			System.out.println("작업(INSERT) 성공");
		}else {
			System.out.println("작업(INSERT) 실패");
		}
	}

}
