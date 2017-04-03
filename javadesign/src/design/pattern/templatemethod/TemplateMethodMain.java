package design.pattern.templatemethod;

public class TemplateMethodMain {

	/**
	 * http://guslabview.tistory.com/115 를 참조한다.
	 * 공통처리부분을 추상클래스(VacationPolicy)에 두고 
	 * 변경되는 부분은 추상클래스의 추상메소드를 상속받아서(EUVacationPolicy, KRVacationPolicy) 구현하도록 강제한다.
	 * 
	 * 추상클래스에 생성자를 만들어 서브 클래스에서 접근할 수 있다.
	 * 이때 추상클래스의 클래스변수는 private로 지정하여야 다른 클래스에서 변경할 수 없다.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 추상클래스에 생성자를 만들어 서브 클래스에서 접근할 수 있다.
		VacationPolicy euv = new EUVacationPolicy("age");
		euv.accrueVactaion();
		
		// 추상클래스의 클래스변수의 접근자를 private로 해야 접근이 불가능 하다.
		//System.out.println(euv.value);
		//euv.value = "name";
		//System.out.println(euv.value);
		
		VacationPolicy krv = new KRVacationPolicy();
		krv.accrueVactaion();
	}
}
