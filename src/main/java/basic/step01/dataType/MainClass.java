package basic.step01.dataType;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		/*
		 *	[ 참조 데이터 타입 ]
		 *	객체의 참조값(주소)를 저장하는 타입.
		 *	기본 데이터 타입 8가지를 제외한 대부분이 참조 데이터 타입이다.
		 *
		 *	참조값이란
		 *	리터럴이 들어있는 객체를 찾아가는 위치 정보.
		 */
		
		String name = "홍길동";			//String 타입(문자열).
		int[] numbers = {1,2,3,4,5};	//배열 타입.
		List<String> list = new ArrayList<>();	//List 인터페이스 타입.
		
		//s1과 s2는 같은 문법.
		String s1 = "hello";
		String s2 = new String("hello");	//명시적으로 String 객체 생성.
		
		//s3는 s1에서 생성한 객체(new String("hello"))의 참조값이 들어있다.
		//즉, s1과 s3가 같은 객체의 참조값이 들어있는 것이다.
		String s3 = s1;
		
		//s1은 "hello"
		//s3는 "바보"
		//hello라는 객체가 바보라는 객체로 변경되는 것이 아니다.
		//바보라는 Sting 객체를 참조하도록 s3가 변경되었다.
		s3 = "바보";
		
		System.out.println(s1);
		System.out.println(s3);
		
		//형변환(casting)
		int num1 = 10;
		String strNum1 = String.valueOf(num1);
		
		int num2 = 10;
		String strNum2 = Integer.toString(num2);
		
		
		System.out.println("메인 메소드가 종료되었습니다.");
	}

}
