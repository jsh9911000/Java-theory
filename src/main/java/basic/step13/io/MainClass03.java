package basic.step13.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작합니다.");
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			System.out.println("문자열 입력: ");
			String line = br.readLine();
			System.out.println("line " + line);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 메소드가 종료됩니다.");
	}

}
