package J10;

public class StringBufferEx {
	public static void main(String[] args) {
		// 객체 생성
		StringBuffer sb = new StringBuffer( "Hello Java!!" );
		System.out.println( "용량 : " + sb.capacity() );		// 28
		System.out.println( "크기 : " + sb.length() );		// 12
		
		// 추가
		System.out.println( "추가 : " + sb.append( "!!" ) );
		System.out.println( "추가 : " + sb );
		
		System.out.println( "추가 : " + sb.insert( 5, " JSP &" ) );
		
		// 삭제
		System.out.println( "삭제 : " + sb.delete( 5, sb.length() ) );
		System.out.println( "용량 : " + sb.capacity() );		// 28
		System.out.println( "크기 : " + sb.length() );		// 5
		
		// trim
		sb.trimToSize();
		System.out.println( "용량 : " + sb.capacity() );		// 5
		System.out.println( "크기 : " + sb.length() );		// 5
	}
}




