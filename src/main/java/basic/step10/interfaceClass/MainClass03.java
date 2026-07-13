package basic.step10.interfaceClass;

public class MainClass03 {
	
	//Remocon 인터페이스를 구현한 Inner Class.
	static class AirconRemocon implements Remocon {

		@Override
		public void up() {
			System.out.println("AirconRemocon의 볼륨을 올려요~!");
		}

		@Override
		public void down() {
			System.out.println("AirconRemocon의 볼륨을 낮춰요~!");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		Remocon r = new AirconRemocon();
		r.up();
		r.down();
		
		System.out.println("메인 메소드를 종료합니다.");
	}

}
