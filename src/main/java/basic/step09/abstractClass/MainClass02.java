package basic.step09.abstractClass;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		Weapon w = new Mygun();
		useWeapon(w);
		
		System.out.println("메인 메소드를 종료합니다.");
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
