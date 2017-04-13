package design.pattern.templatemethod;

public abstract class Animal {

	//protected String value;
	private String name;
	
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void info(){
		System.out.println("Name: "+name);
		System.out.println("Sound:"+sound());
	}

	/**
	 * 상속받은 클래스에서 구현한다.
	 * @return
	 */
	abstract protected String sound();
}
