package pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		List<String> fruitList = new ArrayList<String>();
		System.out.println("과일 이름 입력" );
		String fruit = null;
		while(true) {
			System.out.printf("입력 %d : ", cnt);
			fruit = sc.next();
			cnt++;
			if(fruit.equalsIgnoreCase("x")) break;
			fruitList.add(fruit);
		}
		Collections.sort(fruitList, Collections.reverseOrder());
		System.out.println();
		System.out.println("출력 결과");
		System.out.println(fruitList);
		sc.close();

	}

}
