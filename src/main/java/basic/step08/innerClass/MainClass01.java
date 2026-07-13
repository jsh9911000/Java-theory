package basic.step08.innerClass;

import basic.step08.innerClass.Zoo.Cat;
import basic.step08.innerClass.Zoo.Monkey;

/*
 *	Inner Class
 *	클래스 안에 정의하는 클래스.
 *	만드는 방식은 똑같다.
 *	ex) public class 클래스명.
 */

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		Zoo z = new Zoo();
		Monkey m = z.getMonkey();
		Cat c = z.getCat();
		
		m.say();
		c.say();
		
		System.out.println("메인 메소드를 종료합니다.");
	}

}
