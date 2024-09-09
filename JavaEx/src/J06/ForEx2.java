package J06;


// i++		i = i + 1		i += 1
public class ForEx2 {
	public static void main(String[] args) {
		// for( int i=1; i<11; i++ ) {		// 1 ~ 10
		// for( int i=10; i>0; i-- ) {		// 10 ~ 1
		// for( int i=2; i<11; i+=2 ) {		// 2, 4, 6, 8, 10
		
		int cnt=0, sum=0;
		for( int i=1; i<101; i++ ) {
			// 3의 배수가 아니면서 홀수인 수만 출력
			if( i%3 != 0 && i%2 == 1 ) {
				cnt ++; 	// cnt = cnt + 1;
				sum += i;	// sum = sum + i;
				System.out.println( "i : " + i );
			}
		}
		System.out.println( "개수 : " + cnt );	// 33
		System.out.println( "합계 : " + sum );	// 1633		
	}
}














