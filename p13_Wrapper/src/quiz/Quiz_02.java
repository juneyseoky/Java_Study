package quiz;

import java.util.Arrays;
import java.util.Collections;

public class Quiz_02 {

	public static void main(String[] args) {
		int[] arr = {12, 5, 2, 14, 0};
		Integer[] arrObj = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrObj[i] = arr[i];
		}
//		Arrays.sort(arrObj);
//		System.out.println(Arrays.toString(arrObj));
		Arrays.sort(arrObj, Collections.reverseOrder());
		System.out.println(Arrays.toString(arrObj));
		Quiz_03 s = new Quiz_03();
		s.mtd();
	}
	

}
class Quiz_03{
	void mtd() {
		
	}
}