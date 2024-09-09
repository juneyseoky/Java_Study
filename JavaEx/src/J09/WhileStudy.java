package J09;

// 1~10 랜덤값 하나 발생
// 입력받은 값을 비교해서 "크다" 또는 "작다" 출력
// 맞았을 경우에 몇번만에 맞췄는지를 출력

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class WhileStudy {
	public static void main(String[] args) throws Exception {
		BufferedReader br
			= new BufferedReader( new InputStreamReader( System.in ) );

		int com = (int) ( Math.random() * 10 ) + 1;
		int cnt = 0;		
		while( true ) {
			cnt ++;
			System.out.print( "찍어봐(1~10) : " );
			int answer = Integer.parseInt( br.readLine() ); 
			if( com == answer ) {
				System.out.println( cnt + "번만에 맞았습니다" );
				break;
			} else if( com > answer ) {
				System.out.println( "입력한 값이 작습니다" );	
			} else {
				System.out.println( "입력한 값이 큽니다");
			}			
		}
		
		
	}
}










