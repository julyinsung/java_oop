package design.pattern.templatemethod;

public class EUVacationPolicy extends VacationPolicy{

	public EUVacationPolicy() {
		
	}
	
	public EUVacationPolicy(String value) {
		super(value);

		//�߻�Ŭ������ Ŭ���������� �����ڸ� private�� �ؾ� ������ �Ұ��� �ϴ�.
		//super.value = value;
	}
	
	
	@Override
	protected int alterForLegalMinimums() {
		int h = 10;
		System.out.println("EU alterForLegalMinimums: "+h);
		return h;
	}

}
