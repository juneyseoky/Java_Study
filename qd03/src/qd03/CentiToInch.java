package qd03;

public class CentiToInch implements Conversion {
	private double num;
	
	public CentiToInch(double num) {
		this.num = num;
	}
	@Override
	public void mtdConvs() {
		double res = num * 2.54;
		System.out.printf("\n%.0f inch 는  %.1f cm입니다.\n",num,res);
	}

}
