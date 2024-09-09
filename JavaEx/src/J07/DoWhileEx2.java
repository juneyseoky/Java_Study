package J07;

// 정수하나 입력받아서 구구단 출력
// 2~9 사이가 아니면 다시 입력
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class DoWhileEx2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br 
			= new BufferedReader( new InputStreamReader( System.in ) );
		
		int dan=0;
		do {
			System.out.print( "정수 : " );
			dan = Integer.parseInt( br.readLine() );
		} while( dan < 2 || dan > 9 );
		
		for( int i=1; i<10; i++ ) {
			System.out.println( dan + " * " + i + " = " + (dan*i) );
		}
		

	}
}
















