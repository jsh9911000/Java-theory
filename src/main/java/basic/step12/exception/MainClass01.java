package basic.step12.exception;

import java.util.Scanner;

/*
 *	Exception (예외)
 *	프로그램 실행 중 발생하는 예외 상황(오류)를 객체로 표현.
 *	Exception을 처리하지 않으면 프로그램이 강제 종료된다.
 *
 *	- NumberFormatException: 숫자를 입력해야되는데 문자를 입력한 경우.
 *	- FileNotFoundException: 파일을 읽으려고 하는데 파일이 없는 경우.
 *	- NullPointException: 값이 NULL인 경우.
 *	- ClassNotFoundException: Class가 없는 경우.
 *
 *	try - catch문으로 처리
 *	Exception을 잡아서 프로그램이 강제로 종료되지 않는다.
 *
 *	실무에서는 catch문에 Exception 객체를 넣어서 e.printStackTrace()를 통해 로그를 확인한다.
 *
 *	thows
 *	메소드에서 예외 처리를 하지 않고 호출하는 곳에서 처리하는 것.
 */

public class MainClass01 {

	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		String inputNum = scan.nextLine();
		
		try {
			double num = Double.parseDouble(inputNum);
			double result = num + 100;
			System.out.println("입력한 숫자 + 100은 " + result);
			//NumberFormatException이 발생할 것이다.
			//catch문으로 넘어가서 에러 로그를 확인할 수 있다.
		}catch(Exception e) { 
			e.printStackTrace();
		}
		
		System.out.println("메인 메소드를 종료합니다.");
	}

}
