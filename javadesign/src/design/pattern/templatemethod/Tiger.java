package design.pattern.templatemethod;

public class Tiger extends Animal{

	public Tiger(String name) {
		super(name);
		//�߻�Ŭ������ Ŭ���������� �����ڸ� private�� �ؾ� ������ �Ұ��� �ϴ�.
		//super.value = value;
	}

	@Override
	protected String sound() {
		return "����";
	}

}
