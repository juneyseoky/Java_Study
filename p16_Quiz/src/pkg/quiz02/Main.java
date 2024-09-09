package pkg.quiz02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(11)+10;
		System.out.println("생성된 랜덤 값 : "+ num);
		
		List<Integer> numlist = new ArrayList<Integer>();
		Yaksu yaksu = x -> { 
			for(int i =1; i<=x; i++) {
				if( x % i == 0 ) numlist.add(i);
			}
			System.out.printf("\n약수 : %s", numlist);
		};
		yaksu.mtdYaksu(num);
		
		System.out.println();
		yaksu = x ->{
			int sum = 0;
			for(int i : numlist) sum+=i;
//			for(int i = 1; i<=x; i++) {
//				if( x % i == 0 ) sum +=i;
//			}
		System.out.printf("약수의 합은 : %d \n",sum);
		};
		yaksu.mtdYaksu(num);
		
		System.out.println("\nEnd.");
	}

}
