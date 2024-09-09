package pack_silsp;

public class Avg extends Sum {

	public Avg(double[] num) {
		super(num);
	}
	
	public double mtdAve() {
		double sum = super.mtdSum();
		double avg = 0.0;
		int cnt = super.num.length;
	
		return avg = sum / cnt;
				
	}

}
