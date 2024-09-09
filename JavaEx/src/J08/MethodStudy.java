package J08;

// 오버로드
public class MethodStudy {
	public void disp( char a, int b ) {
		System.out.print( b + "\t" );
		for( int i=0; i<b; i++ ) {
			System.out.print( a );
		}
		System.out.println();
	}
	public void disp( int a, int b, char c ) {
		System.out.print( a - b + "\t" );
		for( int i=0; i<a-b; i++ ) {
			System.out.print( c );
		}
		System.out.println();
	}
	public void disp( char a, char b, int c ) {
		System.out.print( c + "\t" );
		for( int i=0; i<c; i++ ) {
			if( i%2==0 ) System.out.print( a );
			else System.out.print( b );
		}
		System.out.println();
	}	
	public static void main(String[] args) {
		MethodStudy ms = new MethodStudy();
		ms.disp( '@', 3 );			// 3	@@@
		ms.disp( '#', 5 );			// 5	#####
		ms.disp( '%', 7 );			// 7	%%%%%%%
		ms.disp( 9, 5, '&' );		// 4	&&&&
		ms.disp( '@', '#', 7 );		// 7	@#@#@#@
	}
}













