package basic.step02.operator;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		/*
		 *	산술 연산자
		 *	+, -, *, /, %
		 */
		
		int num1 = 5;
		int num2 = 2;
		int sum1 = num1 + num2;
		int sum2 = num1 + 10;
		
		int result1 = 5/3;	//정수끼리 연산하면 결과는 정수로 나온다.
		int result2 = num1/num2;
		
		double result3 = 5/3.0;	//실수로 결과를 얻고 싶다면 하나는 실수여야 한다.
		double result4 = 5/(double)num2;
		
		int result5 = num1%num2;	//나눈 나머지 값.
		
		int number1 = 0;
		number1++;
		number1++;
		number1++;
		System.out.println(number1);	//1씩 증가해서 3이 된다.
		
		int number2 = 0;
		number2--;
		number2--;
		number2--;
		System.out.println(number2);	//1씩 감소해서 -3이 된다.
		
		//변수++ 는 후위 증가이다. 
		//다른 변수에 저장하게 되면, 원래 숫자를 저장하고 증가시킨다.
		int number3 = 5;
		int resNumber1 = number3++;	
		System.out.println(resNumber1);	//5.
		System.out.println(number3);	//6.
		
		//++변수 는 전위 증가이다.
		//다른 변수에 저장하게 되면, 증가시키고 저장한다.
		int number4 = 5;
		int resNumber2 = ++number4;
		System.out.println(resNumber2);	//6.
		System.out.println(number4);	//6.
		
		System.out.println("메인 메소드가 종료되었습니다.");
	}
}
