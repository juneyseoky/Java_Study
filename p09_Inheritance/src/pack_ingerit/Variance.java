package pack_ingerit;

public class Variance extends Average {
	
	public Variance(double[] dataSet) {
		super(dataSet);
	}
	
	public void mtdVar() {
		double var = 0.0;
		double sum = 0.0;
		avg = mtdAvg();
		for (int i = 0; i < dataSet.length; i++) {
			sum += Math.pow((dataSet[i]-avg),2);				;
		}
		var = sum / dataSet.length;
		System.out.printf("분산 :  %.2f\n", var);
	}

}
