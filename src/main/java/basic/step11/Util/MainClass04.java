package basic.step11.Util;

import java.util.HashMap;
import java.util.Map;

public class MainClass04 {

	public static void main(String[] args) {
		/*
		 *  Map의 구조
		 *  Key와 Value를 한 쌍으로 저장하는 박스.
		 */
		
		Map<String, Object> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("나이", 30);
		map.put("주소", "대한민국");
		map.put("결혼 여부", false);
		
		//map이라는 박스 안에 들어간 데이터를 가져오려면 Key를 이용하면 된다.
		
		String name = (String) map.get("이름");
		int age = (int) map.get("나이");
		
		System.out.println(name);
		System.out.println(age);
		
		/*
		 *  그렇다면 List랑 Map이랑 다른게 뭐지?
		 *  데이터를 찾는 방법이 다르다.
		 *  List는 인덱스가 있고 Map은 인덱스가 없다.
		 *  만약 회원 한명의 정보를 담을 거면, Map 객체를 사용한다.
		 *  회원 여러명의 정보를 담을 거면, List<userDto> 와 같이 List 객체를 사용한다.
		 */
	}

}
