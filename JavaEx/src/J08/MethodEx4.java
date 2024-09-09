package J08;

//	C		hapInt2( int, int )
//			hapDouble( double, double )
//			hapInt3( int, int, int )

//	C++		오버로드 - 이름은 같지만 매개변수의 자료형이 다르거나 갯수가 다르거나 순서가 달라도 다른 함수로 취급
//			hap( int, int )
//			hap( double, double )
//			hap( int, int, int )

public class MethodEx4 {
	public void hap( int a, int b ) {
		System.out.println( "합 : " + ( a+b ) );
	}
	public void hap( double a, double b ) {
		System.out.println( "합 : " + ( a+b ) );
	}
	public void hap( int a, int b, int c ) {
		System.out.println( "합 : " + ( a+b+c ) );
	}
	public static void main(String[] args) {
		MethodEx4 me = new MethodEx4();
		me.hap( 5, 2 );
		me.hap( 10, 20 );
		me.hap( 5.5, 3.7 );
		me.hap( 3, 5, 7 );
	}
}









