package qd03;

public class InchToCenti implements Conversion {
	private double num;
	
	public InchToCenti(double num) {
		this.num = num;
	}
	@Override
	public void mtdConvs() {
		double res = num * 0.394;
		System.out.printf("\n%.0f cm 는  %.1f inch 입니다.\n",num,res);
	}

}
