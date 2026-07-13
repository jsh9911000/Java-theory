package basic.step09.abstractClass;

/*
 *	추상 클래스 (Abstract Class)
 *	- abstract 예약어를 통해서 정의.
 *	- 형태만 정의되고 실제 구현은 되지 않은 메소드가 존재. (기본 메소드 + 추상 메소드)
 *	- 생성자는 존재하지만 객체 생성은 불가능.
 *	- 데이터 타입 역할은 가능.
 *	- 추상 클래스를 상속받은 자식 클래스는 추상 메소드를 모두 "오버라이드(재정의)" 해야 한다.
 *	- 주로 유틸리티로 사용됨.
 *	- 하나만 상속 가능. ( 다중 상속 불가능 )
 *
 *	● 오버라이드 (재정의)
 *	상속 관계에서 부모 클래스의 메소드를 자식 클래스가 구현하는 것.
 *
 *	● 오버로딩 
 *	메소드명은 같지만 매개변수(파라미터)를 다르게 해서 여러 개의 메소드를 만드는 것.
 *
 *	※ 추상 클래스에서는 메소드에 abstract 생략 불가능.
 */

public class MainClass01 {

	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		Weapon w = new Mygun();	
		w.prepare();
		w.attack();
		
		/*
		 *	w 변수에는 Mygun 객체의 참조값이 들어있다.
		 *	Mygun 객체는 Weapon 객체를 상속받았기 때문에
		 *	Weapon 부모 객체의 자원을 사용할 수 있다. 
		 */
		
		System.out.println("메인 메소드를 종료합니다.");
	}

}
