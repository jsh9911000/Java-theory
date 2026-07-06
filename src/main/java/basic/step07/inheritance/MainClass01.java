package basic.step07.inheritance;

/*
 *	다형성
 *	- 부모 데이터 타입으로 자식 객체를 사용할 수 있는 것.
 *	- 상속 관계에 따라서 여러가지 데이터 타입이 된다.
 *	- extends 예약어를 통해서 상속받는다.
 *	- 컴파일러는 참조 변수의 데이터 타입을 보고 판단한다.
 *	- 즉, 참조 변수의 자원(필드,메소드)만 사용할 수 있다.	== "미안하다. 부모가 담을 수 있는 그릇이 작다."
 *	- 만약 자식 객체에서 부모 객체의 메소드를 override한 경우에는 자식 객체의 메소드가 실행된다.
 *	- 왜냐하면 실행 시에는 실제 참조하고 있는 객체를 보기 때문이다. 
 *
 *	Object 타입
 *	- 모든 클래스의 최상위 부모 클래스.
 *	- 클래스를 만들때 extends Object를 쓰지 않아도 컴파일러가 자동으로 추가해줌.
 *	- 즉, 모든 클래스는 Object를 상속받는다.
 *	ex) class Person {} == class Porson extends Object {}
 */

public class MainClass01 {

	public static void main(String[] args) {
		Phone p1 = new Phone();			//Phone 객체 생성.	 변수 p1에 Phone 객체의 참조값이 들어있다.
		Phone p2 = new SmartPhone();	//다형성. Phone 객체 생성 후 SmartPhone 객체 생성된다. 변수 p2에는 SmartPhone 객체의 참조값이 들어있다.
		SmartPhone sp1 = new SuperPhone();
		
		p2.call();
		//p2.mobileClall();		컴파일러는 변수의 데이터 타입만 본다. 즉, Phone 객체의 자원(필드,메소드)만 사용할 수 있다.
		sp1.mobileCall();
		sp1.takePicture();
		
		Phone p3 = new SmartPhone();
		SmartPhone sp2 = (SmartPhone) p3;	//다운 캐스팅.
		sp2.mobileCall();  					//메소드 사용 가능.
	}

}
