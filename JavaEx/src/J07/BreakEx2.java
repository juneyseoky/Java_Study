package J07;

// 1부터 누적해 가다가 최초로 합계가 2000이 넘을 때 그 값을 출력
// 63 2016
public class BreakEx2 {
	public static void main(String[] args) {
		int i=0, sum=0;
		while( true ) {
			i++;
			sum += i;
			if( sum >= 2000 )
				break;
		}
		System.out.println( i + "\t" + sum );
	}
}
