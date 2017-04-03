package design.pattern.templatemethod;

public class Tiger extends Animal{

	public Tiger(String name) {
		super(name);
		//추상클래스의 클래스변수의 접근자를 private로 해야 접근이 불가능 하다.
		//super.value = value;
	}

	@Override
	protected String sound() {
		return "어흥";
	}

}
