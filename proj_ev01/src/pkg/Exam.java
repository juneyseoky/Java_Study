package pkg;

public class Exam {
	private int[] taker;
	private int[] pass;
	private double[] rate = new double[5];
	private double passAvg;

	public Exam(int[] taker,int[] pass) {
		this.taker=taker;
		this.pass= pass;
	}

	public void passRate() {
		for (int i = 0; i < pass.length; i++) {
			rate[i] = (double)pass[i]/taker[i]*100;
		}
		System.out.println("2. 결과");
		System.out.println("년 도 : 2016	2017	2018	2019	2020");
		System.out.println("--------------------------------------------");
		System.out.print("합격률 : ");
		for (int i = 0; i < rate.length; i++) {
            System.out.printf("%.1f", rate[i]);
            if (i < rate.length - 1) {
                System.out.print("\t"); // 탭 문자 추가
            }
        }
		// System.out.printf("합격률 : %.1f	%.1f	%.1f	%.1f	%.1f \n\n",rate[0],rate[1],rate[2],rate[3],rate[4]);
	}

	public void passAvg() {
		int takerSum = 0;
		int passSum = 0;
		
		for (int i = 0; i < taker.length; i++) {
			takerSum += taker[i];
			passSum += pass[i];
		}
		passAvg = (double)passSum/takerSum*100;
		
		System.out.printf("\n평균 합격률 :  %.1f \n",passAvg);
	}
	
	public void passCnt() {
		int cnt = 0;
		for (int i = 0; i < rate.length; i++) {
			if(rate[i] > passAvg) cnt++;			
		}
		System.out.printf("평균 이상 합격한 년도 수 : %s 회 \n\nEnd!", cnt);
	}
	

	
}
