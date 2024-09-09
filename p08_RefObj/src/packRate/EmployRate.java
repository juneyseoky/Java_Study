package packRate;

public class EmployRate {
	// 참조 클래스(=커스텀 클래스)
	// => 객체가 되어 클래스의
	// 	  복사본이 된다.
	
	private int employedNum;
	private int graduatedNum;
	private double pct;
	
	public EmployRate(int a, int b) {
		this.employedNum = a;
		this.graduatedNum = b;
	}
	
	public void mtdCalc() {

		pct = (double)graduatedNum/employedNum * 100 ;
		System.out.println("[실행결과]");
		System.out.println("----------------------");
		System.out.printf("취업률 : %.1f %%\n", pct);
		System.out.println("----------------------");
	}
}
