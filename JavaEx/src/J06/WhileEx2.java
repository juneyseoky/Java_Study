package J06;

public class WhileEx2 {
	public static void main(String[] args) {
		int i=0;
		int sum=0, sum_even=0, sum_odd=0;
		//  전체합   짝수합       홀수합
		//	5050    2550       2500
		
		while( i<100 ) {		// 0 ~ 99
			i++;			
			// System.out.println( "i : " + i );
			if( i%2 == 0 )
				sum_even += i;
			else 
				sum_odd += i;
			sum += i;			
		}
		System.out.println( "전체합 : " + sum );
		System.out.println( "짝수합 : " + sum_even );
		System.out.println( "홀수합 : " + sum_odd );
	}
}







