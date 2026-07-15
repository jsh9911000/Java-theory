package basic.step14.file;

import java.io.File;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		File myFile = new File("c:/myFolder");
		
		//파일이 없다면 파일 생성.
		if(!myFile.exists()) {
			myFile.mkdir();
			System.out.println("c:/myFolder 를 생성했습니다.");
		}else {
			myFile.delete();
			System.out.println("c:/myFolder 를 삭제했습니다.");
		}
		
		System.out.println("메인 메소드를 종료합니다.");
	}

}
