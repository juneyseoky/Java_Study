package pkg.quiz02;

import java.util.ArrayList;
import java.util.List;

public class Center {
	public static void main(String[] args) {

		int rndVal = (int) ((20 - 10 + 1) * Math.random() + 10);
		System.out.println("생성된 랜덤 값 : " + rndVal + "\n");
		System.out.println("약수 : ");
		List<Integer> list = new ArrayList<Integer>();
		Yakso inter = (num) -> {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					list.add(i);
				}
			}
			return list;
		};
		
		List<Integer> b = inter.mtdYaksu(rndVal);
		System.out.println(b);
		Yakso inter2 = (v) -> {
			int hap = 0;
			for (int i = 0; i < list.size(); i++) {
				hap += list.get(i);
			}
			list.add(hap);
			return list;
		};
		List<Integer> c = inter2.mtdYaksu(rndVal);
		System.out.println(c.get(c.size()-1));
	}
}