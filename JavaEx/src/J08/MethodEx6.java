package J08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MethodEx6 {
	public int big( int a, int b, int c ) {
		if( a>b && a>c )
			return a;
		else if( b>c )
			return b;
		else
			return c;		
	}	
	public static void main(String[] args) throws Exception {
		BufferedReader br 
			= new BufferedReader( new InputStreamReader( System.in ) );
		
		System.out.print( "정수 : " );
		int a = Integer.parseInt( br.readLine() );
		System.out.print( "정수 : " );
		int b = Integer.parseInt( br.readLine() );
		System.out.print( "정수 : " );
		int c = Integer.parseInt( br.readLine() );
		
		MethodEx6 me = new MethodEx6();
		System.out.println( "큰 수 : " + me.big( a, b, c ) );		
	}
}















