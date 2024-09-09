package numList;

import java.util.Arrays;

public class SmallNumber implements NumberSequence {

	@Override
	public void mtdNumRes(double[] list) {
		double min = Arrays.stream(list).min().getAsDouble();	// Arrays.stream 을 활용한 min 값 구하기
		System.out.printf("가장 작은 값 : %.0f\n", min);
	}

}
