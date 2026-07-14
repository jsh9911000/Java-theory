package basic.step12.exception;

public class MainClass03 {

	public static void main(String[] args) {
		System.out.println("메인 메소드를 시작합니다.");
		
		try {
			divide(10,0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("메인 메소드를 종료합니다.");
	}
	
	public static void divide(int a, int b) throws Exception {
		System.out.println("나누기 : " + a / b);
	}
}
