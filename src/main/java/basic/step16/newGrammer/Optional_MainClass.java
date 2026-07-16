package basic.step16.newGrammer;

import java.util.Optional;

/*
 *	Optional 객체
 *  NullPointException 방지를 위한 클래스. 
 *  값이 존재할 수도, 없을 수도 있는 경우 안전하게 처리 가능. (JAVA 8 버전)
 *  null 체크를 안전하게 처리할 수 있음.
 */

public class Optional_MainClass {
	public static void main(String[] args) {
		
		String name = null;
		 
		Optional<String> optionalName = Optional.ofNullable(name);
		 
		//값이 있으면 출력.
		optionalName.ifPresent(System.out::println);
		 
		// 값이 없으면 기본값 사용
		System.out.println(optionalName.orElse("Unknown"));
		
	}

}
