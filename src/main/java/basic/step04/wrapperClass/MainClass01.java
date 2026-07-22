package basic.step04.wrapperClass;

public class MainClass01 {

	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		
		/*
		 *  String Pool : 문자열 창고.
		 *  자바는 문자열을 너무 많이 사용하고 있기 때문에, 같은 문자열을 매번 새로 만들면 메모리 낭비이다.
		 *  Heap 메모리 안에 특정 문자열 창고를 하나 따로 만든다.
		 *  그래서 JVM이 같은 문자열이면 하나만 만들어서 매번 사용하자라고 해서 만든 창고가 String Pool 이다.
		 *  
		 *  Integer Cache : 자주 사용하는 Integer 객체를 미리 만들어 두고 재사용하는 기능.
		 *  Heap 메모리 안의 Integer Cache에 미리 만들어놓은 Integer 객체들이 있다.
		 *  그리고, Integer 객체를 사용할 때마다 Integer Cache에서 재사용한다.
		 *  즉, 메모리를 계속 생성할 필요없이 사용하는 것이다.
		 */
		
		//기본 데이터 type
		int num1=10;
		//참조 데이터 type
		Integer num2=10;
		
		System.out.println(num1);
		System.out.println(num2);
		
		//참조 Data type이지만 기본 Data type과 동일하게 사용할수 있다.
		//기본 Data type과 참조 Data type의 연산도 가능하다.
		//Integer 타입은 null을 허용한다.
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
		
		System.out.println(result2);
		System.out.println(result3);
		
		/*
		 *  Integer type의 메소드를 이용해서 
		 *  .toString() : 문자열 data로 변환해준다.
		 *  10 => "10" 문자열로 바꾸기 
		 */
		String result4=num2.toString();
		System.out.println(result4);
		/*
		 *  Integer Class의 static 메소드를 이용해서
		 *  .parseInt() : 숫자형 data로 변환해준다. 헷갈리지마라. 기본으로 제공되는 Class Integer의 메소드이다.
		 *  "999" => 999 정수로 바꾸기 
		 */
		int result5=Integer.parseInt("999");
		System.out.println(result5);
		
		System.out.println("메인 메소드가 종료되었습니다.");

	}

}
