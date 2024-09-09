package pack_ingerit;

public class Average {
	protected double[] dataSet;
	protected double avg;
	
	public Average(double[] dataSet) {
		this.dataSet= dataSet;
		
	}	
	
	public double mtdAvg() {
		double sum = 0.0;
		for (int i = 0; i < dataSet.length; i++) {
			sum += dataSet[i];
		}
		avg = sum/dataSet.length;
		
		return avg;
	}
}
