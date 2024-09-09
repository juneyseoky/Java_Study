package pkg.quiz02;

import java.util.Arrays;

public class valuesClac {

	private int str;
	private int sum;
	private char[] numCharList;
	private String[] numStrList;
	private String numStr;

	public valuesClac(int str) {
		this.str = str;
	}

	public void indexValues() {
		numStr = String.valueOf(str);		
//		numStrList = numStr.split("");
//		System.out.println(Arrays.toString(numStrList));
		numCharList = new char[numStr.length()];
		for (int i = 0; i < numCharList.length; i++) {
			numCharList[i] = numStr.charAt(i);
		}
//		System.out.println(Arrays.toString(numStrList));
		System.out.println(Arrays.toString(numCharList));
	}

	public void valuesSum() {
		sum = 0;
		int num = 0;
		for (int i = 0; i < numCharList.length; i++) {
			num = (int)(numCharList[i]-'0');
			sum += num;
//			System.out.println((int)numStr[i]);
		}
		System.out.println("걱 저라수의 합 :" + sum);
	}

}
