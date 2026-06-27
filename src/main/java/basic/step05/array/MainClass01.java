package basic.step05.array;

import java.util.ArrayList;
import java.util.List;

/*
 *	1. 배열을 어떻게 만드는지?
 *	중괄호 {}를 사용한다.
 *
 *	2. 배열의 데이터 타입은 어떻게 선언하는지?
 *	저장되는 데이터의 타입에 []를 붙여서 선언한다.
 *
 *	3. 배열 또한 참조형 데이터 타입이다.
 *
 *	4. 배열의 사이즈가 고정되어 변경이 불가능하다. 배열에 값을 추가하지 못한다.
 *
 *	5. 동일한 타입만 저장할 수 있다.
 *
 */

public class MainClass01 {

	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		
		int[] nums1 = {1,2,3,4,5};
		
		double[] nums2 = {0.1, 0.2, 0.3, 0.4, 0.5};
		
		boolean[] truths = {true, false, true, false};
		
		String[] names = {"홍길동", "김구라", "바보", "멍충이"};
		
		String[] limitSize = new String[3];		//배열은 한번 크기를 정하면 그이상 데이터를 넣거나 바꿀 수 없다.
		
		String name = "홍길동";

		int size = names.length;	//자바에서 기본 제공하는 배열의 사이즈를 확인할 수 있는 필드.
		
		int strSize = name.length();	//자바에서 기본 제공하는 문자열 길이를 확인할 수 있는 메소드.
		
		List<String> strList = new ArrayList<>();
		
		strList.add("홍길동");
		strList.add("김구라");
		strList.add("바보");
		strList.add("멍충이");
		
		int strListSize = strList.size();	//컬렉션(ArrayList, HashMap 등)에서 사이즈를 확인할 수 있는 메소드.
		
		/*
		 *	컬렉션(ArrayList, HashMap 등)
		 *	크기를 자유롭게 늘리거나 줄일 수 있는 자료구조.
		 *	위의 예시와 같이 add() 메소드를 통해서 계속 데이터를 넣을 수 있다.
		 */
		
		System.out.println("메인 메소드가 종료되었습니다.");

	}

}
