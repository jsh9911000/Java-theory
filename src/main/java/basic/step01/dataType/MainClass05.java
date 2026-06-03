package basic.step01.dataType;

import java.util.Iterator;

public class MainClass05 {

	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");

		/*
		 * 	[ 반복문 for문 ]
		 * 	for 입력 후 ctrl + space 자동완성.
		 * 	자동완성 옵션들 중 일반 for문과 forEach문을 선택할 수 있다.
		 * 
		 * 	forEach문: 배열을 순회할 때 사용.
		 */
		
		//일반 for문.
		int num = 0;
		
		for (int i = 0; i < 10; i++) {
			num += 10;
		}
		
		//forEach문.
		int[] nums = {1,2,3,4,5};
		for (int i : nums) {
			System.out.println(i);
		}
		
		//length: 배열의 길이.
		int size = nums.length;
		System.out.println("배열의 길이는 " + size);
		
		//toUpperCase(): 문자열을 모두 대문자로 변환.
		String str = "hello";
		System.out.println(str.toUpperCase());
		
		//toLowerCase(): 문자열을 모두 소문자로 변환.
		String name = "JOHN";
		System.out.println(name.toLowerCase());
		
		System.out.println("메인 메소드가 시작되었습니다.");
	}

}
