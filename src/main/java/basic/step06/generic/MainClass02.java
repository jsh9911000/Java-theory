package basic.step06.generic;

public class MainClass02 {

	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		FruitBox<Apple> f = new FruitBox<>();
		f.setItem(new Apple());
		f.getItem();
		
		Apple apple = f.getItem();
		
		System.out.println("메인 메소드를 종료합니다.");

	}

}
