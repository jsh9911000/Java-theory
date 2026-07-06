package basic.step06.generic;

public class FruitBox <T> {
	
	//필드.
	public T item;
	
	//메소드.
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return this.item;
	}
}
