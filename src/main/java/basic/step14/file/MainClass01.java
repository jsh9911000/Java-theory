package basic.step14.file;

import java.io.File;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		File myFile = new File("c:/");	//C 드라이브를 가르키는 File 객체 생성.
		
		String[] names = myFile.list(); //C 드라이브 안에 있는 파일과 폴더의 이름을 문자열 배열로 조회.
		
		for(String file : names) {
			System.out.println(file);
		}
		
		System.out.println("메인 메소드를 종료합니다.");
	}

}
