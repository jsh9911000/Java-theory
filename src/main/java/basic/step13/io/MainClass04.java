package basic.step13.io;

import java.io.OutputStream;
import java.io.PrintStream;

/*
 *	PrintStream 객체: 문자열을 쉽게 출력하기 위한 객체.
 *	ex) System.out.println()
 *
 *	OutputStream 객체: 바이트를 출력하는 객체.
 */

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		PrintStream ps = System.out;
		OutputStream os=ps;
		
		try {
			os.write(65);
			os.write(66);
			os.write(67);
			os.flush();		//출력.
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 메소드를 종료합니다.");
	}

}
