package numList;

import java.util.Arrays;

public class BigNumber implements NumberSequence {

	@Override
	public void mtdNumRes(double[] list) {
		double max = Arrays.stream(list).max().getAsDouble();	// Arrays.stream 을 활용한 max 값 구하기
		System.out.printf("\n가장 큰 값 : %.0f\n",max);
	}

}
