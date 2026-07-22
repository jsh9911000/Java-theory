package basic.step01.dataType;

public class MainClass01 {

	//메인 메소드: 자바를 실행(run)시켰을 때 JVM이 시작점으로 실행시키는 메소드.
	//JVM은 자바 프로그램을 실행할 때 메인 메소드를 찾고 그 안의 메소드들을 실행시킨다. 
	//클래스를 생성할 때 옵션을 체크해서 자동완성할 수 있다.
	public static void main(String[] args) {
		/*
		 *	[ 기본 데이터 타입 ]
		 *	변수에 리터럴(값)을 저장한다. => 스택(Stack) 메모리에 값 자체를 저장한다.
		 *	기본 데이터 타입은 빠르고 메모리를 적게 소비한다.
		 *	8가지 타입이 있다.
		 *	
		 *	1.정수형: byte, short, int, long
		 *  2.실수형: float, double
		 *  3.논리형: boolean
		 *  4.문자형: char
		 *  
		 *  리터럴: 변수의 값.
		 *  
		 *  int 타입은 null 불가능.
		 */
		
		 System.out.println("메인 메소드가 시작되었습니다.");
		 
		 byte a = 10;
		 short b = 20;
		 int c = 30;
		 long d = 40;
		 
		 //자바는 기본적으로 실수형을 double 타입으로 인식한다.
		 //그렇기 때문에, 다른 실수형 타입은 반드시 식별자를 붙여줘야 한다.
		 float e = 10.1f;
		 double f = 10.1;
		 
		 //변수 선언 후 초기화.
		 int num1;
		 num1 = 10;
		 
		 //변수 선언 및 초기화 후 초기화.
		 int num2 = 0;
		 num2 = 10;
		 
		 //다른 변수의 리터럴을 이용하여 변수 초기화.
		 //다른 변수의 리터럴 자체가 복사된다. (참조값 X)
		 //즉, 기본 데이터 타입 reNum에 num1의 참조값이 들어가는게 아니라
		 //리터럴 자체가 복사되는 것이다.
		 int reNum = num1; 
		 
		 //묵시적 형변환(자동 형변환): 작은 그릇의 값을 큰 그릇에 담는 건 가능.
		 int myInt = 10;
		 byte myByte = 10;
		 
		 int iNum = myByte;
		 //byte bNum = myInt;	컴파일 에러 발생.
		 
		 //형변환(casting)
		 byte bNum = (byte)myInt;	//강제 형변환(casting)을 하면 컴파일 에러 X.
		 
		 float fNum = 10.1f;
		 double dNum = 10.1;
		 
		 double reDnum = fNum;
		 float reFnum = (float)dNum;
		 
		 System.out.println("메인 메소드가 종료되었습니다.");
		 
		 //System.out.println() => 콘솔에 출력하는 메소드. 단축키: syso 작성후 ctrl + space.
		 //자바스크립트에서는 console.log()
		 //파이썬에서는 print()
	}

}
