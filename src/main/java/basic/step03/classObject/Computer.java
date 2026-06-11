package basic.step03.classObject;

public class Computer {
	//필드.
	public String name;
	int price;	
	private String masterName;
	static String color;
	public final int CARNUMBER = 10;
	
	//메소드.
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;			//this를 사용하지 않아도 알아서 가까운 필드를 사용.
	}
}
