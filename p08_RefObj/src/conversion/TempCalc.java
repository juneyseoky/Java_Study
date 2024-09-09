package conversion;

public class TempCalc {
	private int fn;
	private static final double CODE = 5.0/9;
	
	public TempCalc(int fn) {
		this.fn = fn;
	}

	public void mtd() {
		double cn = CODE*(fn-32);
		
		System.out.printf("섭씨 온도는 %.1f \u2103 입니다.\n",cn);
		System.out.println("-----------------------------------");
	
	}
	
	
}
