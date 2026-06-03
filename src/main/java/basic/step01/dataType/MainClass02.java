package basic.step01.dataType;

public class MainClass02 {

	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		
		/*  1. 각각의 점수를 지역변수 eng, kor, math 에 대입해 보세요.
		 *  영어점수 : 100
		 *  국어점수 : 100
		 *  수학점수 : 90 
		 */
		
		int eng = 100;
		int kor = 100;
		int math = 90;
		
		int sum = eng + kor + math;
		
		double avg = (double)sum/3;		//담을 변수의 타입은 실수형이기 때문에 형변환(casting)해야 한다.
		
		boolean isRun = false;
		if(isRun) {		//true인 경우 실행.
			System.out.println("안 달려요");
		}else {			//false인 경우 실행.
			System.out.println("달려요");
		}
		
		boolean isGreate = 10 > 1;
		System.out.println(isGreate);
		
		boolean result = true || false;
		System.out.println(result);
		
		System.out.println("메인 메소드가 종료되었습니다.");
	}

}
