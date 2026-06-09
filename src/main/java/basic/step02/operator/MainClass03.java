package basic.step02.operator;

public class MainClass03 {

	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		
		/*
		 * 	논리 연산자
		 * 	&&(논리곱): 두가지 조건이 모두 true	== and
		 * 	||(논리합): 둘 중 하나만 true	== or
		 * 	!(부정): 아니다	== not
		 */
		
		String name = "홍길동";
		int age = 30;
		
		if(name.equals("홍길동") && age == 30) {
			System.out.println("true");
		}
		
		if(name.equals("홍길동") || age == 40) {
			System.out.println("true");
		}
		
		if(!name.equals("김구라")) {
			System.out.println("false");
		}
		
		if(age != 40) {
			System.out.println("false");
		}
		
		System.out.println("메인 메소드가 종료되었습니다.");

	}

}
