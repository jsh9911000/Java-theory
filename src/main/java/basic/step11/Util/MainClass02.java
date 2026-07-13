package basic.step11.Util;

import java.util.HashMap;
import java.util.Map;

/*
 *	HashMap
 *	키와 값을 한 쌍으로 저장하는 자료구조.
 *	Map 인터페이스를 구현한 객체.
 *	JS의 Object 느낌.
 *
 *	※ 동일한 키로 값을 저장하는 경우, 누적되는 게 아니라 기존 값이 수정된다.
 *
 *	※ Object 타입: 최상위 클래스. 모든 데이터 타입을 담는다.
 */

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		Map<String, Object> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("나이", 35);
		map.put("주소", "원주시");
		map.put("결혼 여부", true);
		
		//Object 타입의 값이기 때문에 형변환해야 한다.
		String name = (String)map.get("이름");
		
		map.remove("나이");
		
		boolean isExistKey = map.containsKey("주소");
		
		boolean isExistValue = map.containsValue("원주시");
		
		int mapSize = map.size();
		
		boolean isEmpty = map.isEmpty();
		
		map.replace("이름", "김구라");
		
		//람다식. (자바 8 버전부터 지원)
		map.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});
		
		map.clear();
		
		System.out.println("메인 메소를 종료합니다.");
	}
}
