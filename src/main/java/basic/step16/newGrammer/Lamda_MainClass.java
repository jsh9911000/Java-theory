package basic.step16.newGrammer;

import java.awt.print.Printable;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 *	람다
 *	익명 함수를 간단하게 표현하는 방식. (JAVA 8 버전)
 */

public class Lamda_MainClass {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","banana","cherry");
		
		for(String a : list) {
			System.out.println(a);
		}
		
		list.forEach(a -> System.out.println(a));
		
		System.out.println();
		
		Runnable runnable = () -> {
		    System.out.println("실행!");
		};

		runnable.run();
		
		Consumer<String> c = (s) -> System.out.println(s);		
		
	}

}
