package basic.step11.Util;

import java.util.Scanner;

/*
 *	Scanner
 *	키보드로부터 문자열을 입력 받기 위한 객체.
 *	생성자의 인자로는 키보드로부터 입력 받을 수 있는 ImputStream 타입 객체를 전달해야 한다. (System.in)
 */

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열을 입력해주세요.");
		
		String line = scan.nextLine();
		
		System.out.println("입력한 내용은 " + line + "입니다.");
		
		System.out.println("메인 메소드를 종료합니다.");
	}
}
