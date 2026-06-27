package basic.step05.array;

public class MainClass03 {

	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		
		int[] nums = {10,20,30,40,50,60,70,80,90,100};
		
		// 배열에 저장된 item 을 순서대로 하나씩 콘솔창에 모두 출력해 보세요.
		
		for(int i = 0; i < nums.length; i++) {
			// 변수(인스턴스)에 담는 방식 == Javascript 방식.
			int tmp = nums[i];
			System.out.println(tmp);
		}
		
		System.out.println("메인 메소드가 종료되었습니다.");
	}

}
