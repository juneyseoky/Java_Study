package pack_quiz;

public class Display {
	
	protected double[] num;
	public Display(double[] num) {
		this.num = num;
	}
	
	public void inputDouble(double[] num) {
		
		System.out.println(num[0]+", "+num[1]+", "+num[2]);
		
	}
}
