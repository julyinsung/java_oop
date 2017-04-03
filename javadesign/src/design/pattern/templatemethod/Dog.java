package design.pattern.templatemethod;

public class Dog extends Animal{

	public Dog() {
		super("dog");
	}
	
	@Override
	protected String sound() {
		return "¸Û¸Û";
	}

}
