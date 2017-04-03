package design.pattern.templatemethod;

public class KRVacationPolicy extends VacationPolicy{

	@Override
	protected int alterForLegalMinimums() {
		int h = 5;
		System.out.println("KR alterForLegalMinimums: "+h);
		return h;
	}

}
