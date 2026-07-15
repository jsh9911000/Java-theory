package basic.step14.file;

import java.io.File;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
			
		File myFile = new File("c:/");
		File[] files = myFile.listFiles();	//파일이나 폴더의 상세 정보를 조회.
		
		for(File f : files) {
			//디렉토리라면
			if(f.isDirectory()) {	
				System.out.println("[ " + f.getName() + " ]");
			}else {	//파일이라면
				System.out.println(f.getName());
			}
		}
		
		System.out.println("메인 메소드를 종료합니다.");
	}

}
