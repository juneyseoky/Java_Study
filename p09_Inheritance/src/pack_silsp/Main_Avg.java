package pack_silsp;

public class Main_Avg {

	public static void main(String[] args) {
		
		double[] num = {2.4, -0.5, 7.7};
		
		Avg obj = new Avg(num);
		double res = obj.mtdAve();
		System.out.println("평균 : "+ res);
		System.out.printf("평균 : %.1f\n",res);

	}

}
