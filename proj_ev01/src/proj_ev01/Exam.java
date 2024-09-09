package proj_ev01;

public class Exam {
	double sum = 0.0;
	double[] scd = new double[5];
	double scdAgv = 0.0;
	int cnt = 0;

	public void result(int[][] data) {
		for (int j = 0; j < scd.length; j++) {
			scd[j] = (double)data[j][1]/data[j][0]*100;
			sum+=scd[j];
			scdAgv = (double)sum/5;			
		}
		for (int i = 0; i < scd.length; i++) {
			if(scd[i] > scdAgv) {
				cnt++;
			}
		}
		
		System.out.println("\n2. 결과");
		System.out.println("년  도 :  2016   2017   2018   2019   2020");
		System.out.println("-------------------------------------------");
		System.out.printf("합격률 :  %.1f   %.1f   %.1f   %.1f   %.1f \n\n",scd[0],scd[1],scd[2],scd[3],scd[4]);
		
		System.out.printf("평균 합격률 : %.1f %%\n",scdAgv);
		System.out.println("평균 이상 합격한 년도 수 : "+cnt+" 회");
		System.out.println("\nEnd");
		
	}

}
