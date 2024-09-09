package aliquot;

import java.util.ArrayList;
import java.util.List;

public class YaksuList implements Yaksu {
	protected int rndNum;

	public YaksuList(int rndNum) {
		this.rndNum = rndNum;
	}

	@Override
	public void mtdYaiksu() {

		List<Integer> yaksuList = new ArrayList<Integer>();
		for (int i = 1; i <= rndNum; i++) {
			if (rndNum % i == 0) yaksuList.add(i);
		}

		System.out.println("약수 : " + yaksuList);
	}

}
