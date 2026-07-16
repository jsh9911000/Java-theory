package basic.step16.newGrammer;

/*
 *	삼항 연산자
 *	조건에 따라 두 값 중 하나를 선택하는 연산자.
 *	if - else문과 같다.
 */

public class TernaryOperator_MainClass {
	public static void main(String[] args) {
		
		int age = 20;

		String result = age >= 19 ? "성인" : "미성년자";

		System.out.println(result);
		
		String userNode = "";
        
        String userUnqKey = (userNode == null || userNode.isEmpty())
        		? null
        		: "김구라";	

	}

}
