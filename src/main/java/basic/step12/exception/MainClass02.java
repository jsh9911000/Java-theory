package basic.step12.exception;

public class MainClass02 {

	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		//for문 안에서 1초씩 delay 시키는 경우.
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("메인 메소드를 종료합니다.");
	}

}
