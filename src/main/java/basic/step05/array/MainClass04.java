package basic.step05.array;

import java.io.File;

public class MainClass04 {

	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		
		//myFolder 라는 폴더가 존재한다면 삭제하고, 존재하지 않으면 만드는 프로그래밍.
		File f1 = new File("c://acon202112//myFolder");
		boolean isExists = f1.exists();
		if(isExists) {
			f1.delete();	//File 객체에서 제공하는 폴더를 삭제는 메소드.
		}else {
			f1.mkdir();		//File 객체에서 제공하는 폴더를 생성하는 메소드.
		}
		
		System.out.println("메인 메소드가 종료되었습니다.");

	}

}
