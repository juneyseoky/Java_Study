package pack_silsp;

public class Sum {
	protected double[] num;
	
	public Sum(double[] num) {
		this.num = num;
	}
	
	public double mtdSum() {
		
		double sum = 0.0;
		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		
		return sum;
	}

}
