package qd02;

public class Calc {
	private int firstNum;
	private int secondNum;
	private String numType;
	
	public Calc(int firstNum, int secondNum, String numType) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.numType = numType;
	}

	public void sum() {

		int empty = 0 ;
		int sum = 0 ;
		if (firstNum > secondNum) {			
			empty = firstNum;
			firstNum = secondNum;
			secondNum = empty ;
		}
		for(int i=firstNum; i<=secondNum; i++) {
			if(numType.equals("짝수")&& i % 2 == 0) sum += i;
			else if(numType.equals("홀수")&& i % 2 == 1) sum += i;
		}
		System.out.printf("%d부터 %d까지의 %s 누적 : %d\n",firstNum,secondNum,numType,sum);
	}
	
	
}
