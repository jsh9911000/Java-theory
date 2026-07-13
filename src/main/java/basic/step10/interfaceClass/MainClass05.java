package basic.step10.interfaceClass;

import java.util.HashSet;
import java.util.Set;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		//Set 인터페이스: 중복을 허용하지 않는 컬렉션.
		Set<String> names = new HashSet<>();
		names.add("홍길동");
		names.add("이미자");
		names.add("김구라");
		names.add("홍길동");
		
		System.out.println(names);
		
		System.out.println("메인 메소드를 종료합니다.");
	}

}
