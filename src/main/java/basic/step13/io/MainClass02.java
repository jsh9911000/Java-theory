package basic.step13.io;

import java.io.InputStream;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
	
		InputStream is = System.in;
		
		try {
			System.out.println("문자 1개 입력: ");
			int code = is.read();
			
			System.out.println("code: " + code);
			
			char ch = (char)code;
			
			System.out.println("char: " + ch);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 메소드를 종료합니다.");
	}

}
