package basic.step13.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 *	InputStream 객체: 데이터를 1 바이트씩 읽는 객체.
 *	InputStreamReader 객체: 바이트를 문자로 변환하는 객체.
 *	BufferedReader 객체: 문자를 빠르게 읽게 해주는 객체.
 *
 *	ex) txt 파일에 "안녕하세요"를 읽어내려면
 *	InputStream 객체는 안/녕/하/세/요 한 글자씩 읽는다.
 *	BufferReader 객체는 안녕하세요 전체를 읽는다.
 */

public class MainClass01 {

	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			System.out.println("아무거나 입력하세요.");
			String line = br.readLine();
			System.out.println("입력한 내용: " + line);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 메소드를 종료합니다.");
	}

}
