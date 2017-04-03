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

	abstract protected String sound();
}
