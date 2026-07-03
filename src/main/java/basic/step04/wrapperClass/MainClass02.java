package basic.step04.wrapperClass;

public class MainClass02 {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		String result = str.replace("World", "Java");
		
		System.out.println(str); 		//"Hello World"
		System.out.println(result);		//"Hello Java"
		
		Integer a = 10;
		a = a + 1;
		
		System.out.println(a);	//11
		
		/*
		 *	a 객체는 10이라는 값을 그대로 가지고 있고
		 *	11이라는 값을 가진 새로운 객체가 만들어지는 것이다.
		 */
		
		String s = "hello";
		s = s + "!";
		
		System.out.println(s);	//"hello!"
		
		/*
		 *	s 객체 안에는 "hello!"를 가르키는 참조값이 들어있다.
		 */
	} 

}
