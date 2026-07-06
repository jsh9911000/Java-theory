package basic.step07.inheritance;

/*
 *	다운 캐스팅
 *	- 실제 객체가 다운 캐스팅하려는 타입이거나 그 타입의 자식이어야 한다.
 *	- 즉, 상속 관계 뿐만 아니라 반드시 실제 객체가 그 타입인지도 확인해야 한다.
 */

public class MainClass02 {

	public static void main(String[] args) {
		
		Phone p1 = new SmartPhone();
		Phone p2 = p1;
		p2.call();
		
		SuperPhone sp = (SuperPhone) p1;	//다운 캐스팅 에러 발생. 왜냐면 실제 객체는 SmartPhone이기 때문.
		sp.doInternet();
		sp.mobileCall();
		sp.takePicture();
		
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.mobileCall();
		smartPhone.takePicture();
	}

}
