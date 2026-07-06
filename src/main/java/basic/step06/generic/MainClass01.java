package basic.step06.generic;

import java.util.ArrayList;
import java.util.List;

/*
 *	제네릭
 *	객체를 생성할때 데이터 타입을 결정.
 *	<> 로 데이터 타입을 결정.
 */

public class MainClass01 {

	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("김구라");
		list.add("이미자");
		
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println("메인 메소드를 종료합니다.");
	}

}
