package basic.step02.operator;

public class MainClass05 {

	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		
		/*
		 * 	삼항 연산자
		 * 	if - else 문과 똑같다.
		 */
		
		boolean isWait = false;
		String result1 = isWait ? "기다려요" : "안 기다려요";
		
		String result2 = null;
		if(isWait) {
			result2 = "기다려요";
		}else {
			result2 = "안 기다려요";
		}
		
		System.out.println("메인 메소드가 종료되었습니다.");

	}

}
