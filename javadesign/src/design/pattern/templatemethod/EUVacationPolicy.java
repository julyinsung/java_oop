package design.pattern.templatemethod;

public class EUVacationPolicy extends VacationPolicy{

	public EUVacationPolicy() {
		
	}
	
	public EUVacationPolicy(String value) {
		super(value);

		//추상클래스의 클래스변수의 접근자를 private로 해야 접근이 불가능 하다.
		//super.value = value;
	}
	
	
	@Override
	protected int alterForLegalMinimums() {
		int h = 10;
		System.out.println("EU alterForLegalMinimums: "+h);
		return h;
	}

}
