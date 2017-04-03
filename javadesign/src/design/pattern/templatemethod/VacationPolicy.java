package design.pattern.templatemethod;

public abstract class VacationPolicy {

	//protected String value;
	private String value;
	
	public VacationPolicy() {
		// TODO Auto-generated constructor stub
	}
	
	public VacationPolicy(String value) {
		this.value = value;
	}
	
	public void accrueVactaion(){
		int bh = calBaseVacationHour();
		int mh = alterForLegalMinimums();
		applyToPayRoll(bh, mh);
		System.out.println("Base Value: "+value);
	}

	private void applyToPayRoll(int bh, int mh) {
		System.out.println("applyToPayRoll: "+(bh+mh));
	}

	abstract protected int alterForLegalMinimums();

	private int calBaseVacationHour() {
		int h = 5;
		System.out.println("calBaseVacationHour: "+h);
		return h; 
	}
}
