package J10;

import java.util.StringTokenizer;
public class StringStudy {
	public static void main( String[] args ) {
		String jumin = "801112-1000000";
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer( jumin, "-" );	
		// "801112" "1000000"  		"801112100000"
				
		// 당신은 1980년 11월 12일생이고 44살이고 남자입니다 출력		
		while( st.hasMoreTokens() ) {
			sb.append( st.nextToken() );
		}
		
		int year = ( sb.charAt( 0 )-48 ) * 10 + sb.charAt( 1 )-48;
		year += sb.charAt( 6 ) == '3' || sb.charAt( 6 ) == '4' ? 2000 : 1900;  
		int month = ( sb.charAt( 2 )-48 ) * 10 + sb.charAt( 3 )-48;
		// int day = ( sb.charAt( 4 )-48 ) * 10 + sb.charAt( 5 )-48;
		// int day = Integer.parseInt( sb.substring( 4, 6 ) );
		
		char m[] = sb.toString().toCharArray();
		int day = ( m[4]-48 ) * 10 + ( m[5]-48 );
		
		int age = 2024 - year;
		String gender = sb.charAt( 6 ) == '1' || sb.charAt( 6 ) == '3' ? "남자" : "여자";
					
		System.out.println( 
			"당신은 " + year + "년 " + month + "월 " + day + "일 "
			+ age + "살이고 " + gender + "입니다" );	
		
	}
}








