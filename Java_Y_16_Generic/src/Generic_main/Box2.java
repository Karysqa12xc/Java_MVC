package Generic_main;

public class Box2 <T>{
	private T value;
	
	public Box2(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
