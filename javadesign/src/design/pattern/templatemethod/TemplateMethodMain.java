package design.pattern.templatemethod;

public class TemplateMethodMain {

	/**
	 * http://guslabview.tistory.com/115 �� �����Ѵ�.
	 * ����ó���κ��� �߻�Ŭ����(Animal)�� �ΰ� 
	 * ����Ǵ� �κ��� �߻�Ŭ����(Animal)�� �߻�޼ҵ�(sound)�� ��ӹ޾Ƽ� �����ϵ��� �����Ѵ�.
	 * 
	 * �߻�Ŭ������ �����ڸ� ����� ���� Ŭ�������� ������ �� �ִ�.
	 * �̶� �߻�Ŭ������ Ŭ���������� private�� �����Ͽ��� �ٸ� Ŭ�������� ������ �� ����.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// �߻�Ŭ������ �����ڸ� ����� ���� Ŭ�������� ������ �� �ִ�.
		Animal t = new Tiger("Tiger");
		t.info();
		
		//�߻�Ŭ������ Ŭ���������� �����ڸ� private�� �ؾ� ������ �Ұ��� �ϴ�.
		//t.name = "tiger";
		
		Animal d = new Dog();
		d.info();
	}
}
