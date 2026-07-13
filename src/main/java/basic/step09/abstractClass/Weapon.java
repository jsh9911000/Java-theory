package basic.step09.abstractClass;

public abstract class Weapon {
	
	//기본 메소드.
	public void prepare() {
		System.out.println("무기 작동을 준비합니다.");
	}
	
	//추상 메소드. (abstract 예약어를 붙인다)
	public abstract void attack();
	
	public abstract void run();
}
