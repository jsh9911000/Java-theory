package basic.step14.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *	FileInputStream 객체: 파일에서 데이터를 읽기 위한 객체.
 *	FileOutputStream 객체: 파일에 데이터를 쓰는 객체.
 */

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(new File("c:/myFolder/1.jpg"));
			fos = new FileOutputStream(new File("c:/myFoldar/copied.jpg"));
			
			while(true) {
				int data = fis.read();
				System.out.println(data);
				
				if(data == 1) {
					break;	//반복문 탈출.
				}
				
				fos.write(data);
				fos.flush();
			}
			
			System.out.println("파일을 성공적으로 복사했습니다.");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 메소드를 종료합니다.");
	}

}
