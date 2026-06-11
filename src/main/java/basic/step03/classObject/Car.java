package basic.step03.classObject;

public class Car {
	//필드.
	public String carName;
	public int cc;
	public String color;
	public String masterName;
	public int price;
	
	//메소드.
	public void setCarName(String carName) {	//필드 값을 설정할때 메소드명을 set으로 시작.
		//carName = carName;					
		this.carName = carName;					//필드명과 파라미터명이 같을 때, this를 통해서 객체를 표시.
	}
	
	public String getCarName() {				//필드 값을 return하는 경우 메소드명을 get으로 시작.
		return carName;
	}
	
	public void drive() {
		System.out.println("운전합니다.");
	}
	
	public void hotHip() {
		System.out.println("엉덩이를 따듯하게 해줘요.");
	}
}
