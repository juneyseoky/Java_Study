package pkg.quiz01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calc {
	private int resNum;
	private int cnt = 0;
	List<Integer> divisor = null;

	public Calc(int resNum) {
		this.resNum = resNum;
		
	}

	public void divisor() {
		int i = 0;
		divisor =  new ArrayList<Integer>();
		for( i=1; i<=resNum; i++) {
			if(resNum % i == 0) {
				divisor.add(i);
			}
		}
		System.out.println("약수목록 : " + divisor);
	}

	public void diviCnt() {
		for(int i=1; i<=resNum; i++) {
			if(resNum % i == 0) {
				cnt++;
			}
		}
		System.out.println("약수의 개수 : " + cnt);
	}

	public void primeNum() {
		if(divisor.size() > 2) {
			System.out.println("소수가 아닙니다.");
		}else {
			System.out.println("소수 입니다.");
		}
	}
	
}
