package J09;

/*
	덧셈문제 10문제 출력
	
	1~100 랜덤값을 두 개 발생
	[1] 25 + 36 = 
	[2] ...
	...
	[10] 
	
	사용자가 입력한 답이 맞았을 경우 	"정답" 출력, 맞은개수 1개 증가, + 10점
	사용자가 입력한 답이 틀렸을 경우	"오답" 출력, 정답을 알려준다
	
	10문제를 다 풀면 맞은 개수, 점수를 출력
	
	더할거냐 말거냐? 여부를 입력
	Y/y 입력되면 다시 10문제 출력
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MultiStudy {
	public static void main(String[] args) throws Exception {
		BufferedReader br 
			= new BufferedReader( new InputStreamReader( System.in ) );
		String yn = null;
		do {			
			int cnt=0, sum=0;
			for( int i=0; i<10; i++ ) {			
				int a = (int) ( Math.random() * 100 ) + 1;
				int b = (int) ( Math.random() * 100 ) + 1;
				System.out.print( 
					"[" + (i+1) + "번 문제 ] " + a + " + " + b + " = " );
				int answer = Integer.parseInt( br.readLine() );
				
				if( (a+b) == answer ) {
					System.out.println( "정답입니다" );
					cnt ++;
					sum += 10;
				} else {
					System.out.println( "오답입니다" );
					System.out.println( "정답은 " + (a+b) + "입니다" );
				}			
				System.out.println();
			}
			System.out.println( "맞은 개수 : " + cnt );
			System.out.println( "점수 : " + sum );
			
			System.out.println();
			System.out.print( "더할거냐 말거냐?(Y/y) : " );
			yn = br.readLine();
		} while( yn.equals( "Y" ) || yn.equals( "y" ) );
	}
}

















