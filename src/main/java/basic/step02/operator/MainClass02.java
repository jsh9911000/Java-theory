package basic.step02.operator;

public class MainClass02 {

	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		
		/*
		 * 	비교 연산자
		 * 	==, !=, >, >=, <, <=
		 */
		
		boolean result1 = 10 == 10;	//true.
		boolean result2 = 10 != 10; //false.
		boolean result3 = 10 > 100;	//false.
		boolean result4 = 10 >= 10; //true.
		boolean result5 = 10 < 100; //true.
		boolean result6 = 10 <= 100; //true.
		
		String name1 = null;	//값이 없음.
		String name2 = "";		//빈 문자열.
		
		System.out.println("메인 메소드가 종료되었습니다.");
	}

}
