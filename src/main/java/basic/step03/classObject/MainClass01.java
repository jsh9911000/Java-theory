package basic.step03.classObject;

public class MainClass01 {

	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		/*
		 * 객체를 생성하면 Heap 메모리에 객체가 생성된다.
		 * 그 객체는 참조값(주소)를 갖게 된다.
		 * 변수는 그 참조값(주소)를 저장한다.
		 */
		
		
		Car car1 = new Car();	//객체 생성.
		car1.carName = "소나타";
		car1.drive();
		
		Car car2 = new Car();	//객체 생성.
		Car car3 = car2;		//car2, car3는 같은 객체 참조값(주소)를 갖게 된다.
		
		
		
		System.out.println("메인 메소드를 종료합니다.");

	}

}
