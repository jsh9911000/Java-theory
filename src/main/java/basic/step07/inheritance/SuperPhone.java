package basic.step07.inheritance;

//final: 더이상 상속받지 못하게 종단 Class로 만드는 예약어.
public final class SuperPhone extends SmartPhone{
	
	//생성자.
	public SuperPhone() {
		System.out.println("SuperPhone 생성자 호출됨.");
	}
	
	//메소드.
	public void doInternet() {
		System.out.println("인터넷을 해요!");
	}
	
	@Override
	public void takePicture() {
		System.out.println("1000만 화소로 사진을 찍어요!");
	}
	
	/*
	 *	@Override
	 *	재정의한 메소드라고 표시해주는 어노테이션.
	 *
	 *	super
	 *	부모 객체를 가리키는 예약어.
	 */
}
