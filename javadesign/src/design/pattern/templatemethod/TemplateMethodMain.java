package design.pattern.templatemethod;

public class TemplateMethodMain {

	/**
	 * http://guslabview.tistory.com/115 �� �����Ѵ�.
	 * ����ó���κ��� �߻�Ŭ����(VacationPolicy)�� �ΰ� 
	 * ����Ǵ� �κ��� �߻�Ŭ������ �߻�޼ҵ带 ��ӹ޾Ƽ�(EUVacationPolicy, KRVacationPolicy) �����ϵ��� �����Ѵ�.
	 * 
	 * �߻�Ŭ������ �����ڸ� ����� ���� Ŭ�������� ������ �� �ִ�.
	 * �̶� �߻�Ŭ������ Ŭ���������� private�� �����Ͽ��� �ٸ� Ŭ�������� ������ �� ����.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// �߻�Ŭ������ �����ڸ� ����� ���� Ŭ�������� ������ �� �ִ�.
		VacationPolicy euv = new EUVacationPolicy("age");
		euv.accrueVactaion();
		
		// �߻�Ŭ������ Ŭ���������� �����ڸ� private�� �ؾ� ������ �Ұ��� �ϴ�.
		//System.out.println(euv.value);
		//euv.value = "name";
		//System.out.println(euv.value);
		
		VacationPolicy krv = new KRVacationPolicy();
		krv.accrueVactaion();
	}
}
