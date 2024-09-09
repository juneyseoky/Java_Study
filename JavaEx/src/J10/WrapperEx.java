package J10;

/*	
	Wrapper Class
	boolean				Boolean
	byte				Byte
	char				Character
	double				Double
	float				Float
	int					Integer
	short				Short
	long				Long
	void				Void
*/

public class WrapperEx {
	public static void main(String[] args) {
		System.out.println( "Bytes : " + Integer.BYTES );
		System.out.println( "Max : " + Integer.MAX_VALUE );
		System.out.println( "Min : " + Integer.MIN_VALUE );
		
		int a = Integer.parseInt( "123" );
		// int b = Integer.parseInt( "ABC" );		예외발생		
		Integer c = Integer.valueOf( "123" );
		
		System.out.println( "2진수 : " + Integer.toBinaryString( c ) );
		System.out.println( "8진수 : " + Integer.toOctalString( c ) );
		System.out.println( "16진수 : " + Integer.toHexString( c ) );
		
		//             512   256 128 64  32  16    8   4   2   1 
		// 0   0   0   0     0   0   1   1   1     1   0   1   1
		
		
		//					 4	 2   1   4   2     1   4   2   1
		// 0   0   0   0     0   0   1   1   1     1   0   1   1
		//                   1           7             3
		
		//                       8   4   2   1     8   4   2   1
		// 0   0   0   0     0   0   1   1   1     1   0   1   1
		//			             7                 b 
		// 0~9 a b c d e f
		
		// R(0~255) G(0~255) B(0~255)
		//    ff       ff       ff		
		
		
		// 오토박싱 / 언박싱		1.4버전까지 에러 발생
		int d = new Integer( 10 );		// 일반변수 = 참조값	10
		Integer e = 10;					// 참조변수 = 정수값	new Integer( 10 )
		
	}
}
























