package basic.step08.innerClass;

public class Zoo {
	
	//메소드. (Inner Class 객체를 생성해서 return 하는 방식)
	public Monkey getMonkey() {
		return new Monkey();
	}
	
	public Cat getCat() {
		return new Cat(); 
	}
	
	//Monkey Inner Class.
	public class Monkey {
		//메소드.
		public void say() {
			System.out.println("안녕~! 나는 원숭이야~!");
		}
	}
	
	//Cat Inner Class
	public class Cat {
		//메소드.
		public void say() {
			System.out.println("안녕~! 나는 고양이야~!");
		}
	}
}
