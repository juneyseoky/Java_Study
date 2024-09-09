package J10;

import java.util.StringTokenizer;
public class StringTokenizerEx {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer( "2024/08/05", "/", true ); 
		System.out.println( "개수 : " + st.countTokens() );
		while( st.hasMoreTokens() ) {
			System.out.println( "Token : " + st.nextToken() );
		}		
		System.out.println( "개수 : " + st.countTokens() );
		// st.nextToken();	예외발생
		
	}
}
