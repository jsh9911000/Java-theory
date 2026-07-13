package basic.step09.abstractClass;

public class Mygun extends Weapon{
	
	//부모 클래스의 추상 메소드를 오버라이드(재정의).
	@Override
	public void attack() {
		System.out.println("빵야빵야~!");
	}

	@Override
	public void run() {
		System.out.println("도망쳐요~!");
	}
	
}
