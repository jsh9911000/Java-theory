package basic.step10.interfaceClass;

/*
 *	인터페이스 (Interface)
 *	- new >> interface 생성.
 *	- 생성자가 없다. (객체 생성 불가)
 *	- final 상수 필드 가능.
 *	- 추상 메소드만 가능. (abstract 생략 가능)
 *	- 데이터 타입의 역할을 할 수 있다.
 *	- 다중 구현(implements) 가능.
 *	- 구현한 클래스는 (1)ctrl + space / (2)클래스에 마우스오버 하고 Add unimplements methods.
 *	- 구식 MVC 패턴에서 Service.java가 인터페이스이다.
 *	- 현대 MVC 패턴에서 MyBatis를 사용하는 경우, DAO를 인터페이스이다.
 *
 *	※ 상수
 *	고정된 값.
 *	final 예약어를 붙인다.
 *	필드명은 대문자.
 *
 *	※ static 
 *	공유자원.
 *	객체를 생성하지 않고 자원을 사용할 수 있다.
 *	ex) Person.COMPANY;
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		Remocon r = new RemoconImpl();
		r.up();
		r.down();
		
		String companyName = r.COMPANY;
		
		System.out.println("메인 메소드를 종료합니다.");
	}
}
