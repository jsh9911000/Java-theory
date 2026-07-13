package basic.step08.innerClass;

public class MyUtil {
	
	//필드.
	private String owner = "김구라";
	
	//메소드.
	private void test() {
		System.out.println("MyUtil 테스트 중입니다.");
	}
	
	//Inner Class.
	public class User {
		public void doSomething() {
			//바깥에 자신을 포함하고 있는 객체의 참조값을 가르키는 방법.
			System.out.println(MyUtil.this.owner); 
			MyUtil.this.test();
			
			//Inner Class에 동일한 이름의 필드와 메소드가 없다면 MyUtil.this 생략 가능.
			System.out.println(owner);
			test();
			MyUtil a = MyUtil.this;
			User b = this;
		}
	}
}
