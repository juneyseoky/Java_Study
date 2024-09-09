package J09;

// String 클래스
public class StringEx {
	public static void main(String[] args) {
		// 객체 생성
		String s1 = "Hello";		// 자바에서 문자열은 String 객체다.
		String s2 = "Hello";
		if( s1 == s2 ) System.out.println( "같다" );			// 주소비교
		else System.out.println( "다르다" );	
		if( s1.equals( s2 ) ) System.out.println( "같다" );	// 내용비교
		else System.out.println( "다르다" );
		
		String s3 = new String( "Hello" );
		String s4 = new String( "Hello" );
		if( s3 == s4 ) System.out.println( "같다" );			// 주소비교
		else System.out.println( "다르다" );	
		if( s3.equals( s4 ) ) System.out.println( "같다" );	// 내용비교
		else System.out.println( "다르다" );
		
		if( "Hello".equals( s4 ) ) System.out.println( "같다" );			// 주소비교
		else System.out.println( "다르다" );
		
		System.out.println();
		// String 과 StringBuffer
		s1 += " Java!!";		// 문자열을 추가
		if( s1 == s2 ) System.out.println( "같다" );	
		else System.out.println( "다르다" );	
		
		System.out.println();
		// String 의 메서드
		
		//   0   1   2   3   4   5   6   7   8   9   10  11  12		index
		// | H | e | l | l | o |   | J | a | v | a | ! | ! | \0 |	배열
		
		// char charAt(int index)
		System.out.println( "charAt : " + s1.charAt( 6 ) );
		
		// int indexOf(int ch)
		System.out.println( "indexOf : " + s1.indexOf( 'J' ) );
		System.out.println( "indexOf : " + s1.indexOf( 'a' ) );
		System.out.println( "indexOf : " + s1.indexOf( 'c' ) );
		
		// int indexOf(int ch, int fromIndex)
		System.out.println( "indexOf : " + s1.indexOf( 'a', 8 ) );
		
		// int indexOf(String str)
		System.out.println( "indexOf : " + s1.indexOf( "!!" ) );
		
		// int lastIndexOf(int ch)
		System.out.println( "lastIndexOf : " + s1.lastIndexOf( 'a' ) );
		
		// String concat(String str)		
		System.out.println( "concat : " + s1.concat( "!!" ) );
		String s5 = s1.concat( "!!" );
		System.out.println( "concat : " + s1 );
		
		// boolean startsWith(String prefix)
		System.out.println( "startsWith : " + s1.startsWith( "hello" ) );
		
		// String substring(int beginIndex)
		System.out.println( "substring : " + s1.substring( 6 ) );
		
		// String substring(int beginIndex, int endIndex)	endIndex -1
		System.out.println( "substring : " + s1.substring( 6, 11 ) );
		
		// String trim()
		String a = "    a   a   a     ";
		System.out.println( "trimg : " + a );
		System.out.println( "trimg : " + a.trim() );
		
//		int a = 10;			// 변수
//		String b = "123";	// 객체
//		String = "abc";	
//
//		b = (String) a;		// 에러
//		b = String.valueOf( a );	// String 리턴
//
//		a = (int) b;		// 에러
//		a = Integer.parseInt( b );	// int 리턴
//		a = Integer.valueOf( b );	// Integer  리턴
		
	}
}










