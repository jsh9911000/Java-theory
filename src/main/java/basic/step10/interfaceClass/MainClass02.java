package basic.step10.interfaceClass;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		Remocon r = new RemoconImpl();
		
		useRemocon(r);
		
		System.out.println("메인 메소드를 종료합니다.");
	}

	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
