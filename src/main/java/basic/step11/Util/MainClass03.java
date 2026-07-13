package basic.step11.Util;

import java.util.ArrayList;
import java.util.List;

/*
 *	ArrayList
 *	순서대로 데이터를 저장하는 배열 컬렉션.
 *	기본 배열은 크기가 정해져 있는 반대로 크기를 조절할 수 있다.
 *	List 인터페이스를 구현한 객체.
 */

public class MainClass03 {

	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");

		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("이미자");
		list.add("김구라");
		
		String name = list.get(0);
		
		list.set(1, "멍충이");
		
		list.remove(2);
		
		int listSize = list.size();
		
		boolean isExist = list.contains("이미자");
		
		boolean isEmpty = list.isEmpty();
		
		list.clear();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String names : list) {
			System.out.println(names);
		}
		
		//람다식. (자바 8 버전부터 지원)
		list.forEach(n -> {
			System.out.println(n);
		});
		
		System.out.println("메인 메소드를 종료합니다.");
	}

}
