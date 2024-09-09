package J08;

// 지역변수 / 전역변수 / 매개변수

// 매개변수 인수 인자 argument parameter

// 5,2 합 차 곱 몫 출력
public class MethodEx3 {
	// int a=5, b=2;			// 전역변수
	public void hap( int a, int b ) {			// 매개변수
		// int a=5, b=2;		// 지역변수
		System.out.println( "합 : " + ( a+b ) );
	}	
	public void cha( int a, int b ) {
		// int a=5, b=2;		// 지역변수
		System.out.println( "차 : " + ( a-b ) );
	}
	public void gop( int a, int b ) {
		// int a=5, b=2;		// 지역변수
		System.out.println( "곱 : " + ( a*b ) );
	}
	public void mok( int a, int b ) {
		// int a=5, b=2;		// 지역변수
		System.out.println( "몫 : " + ( a/b ) );
	}
	public static void main(String[] args) {
		MethodEx3 me = new MethodEx3();
		me.hap( 5, 2 );
		me.cha( 5, 2 );
		me.gop( 5, 2 );
		me.mok( 5, 2 );
	}
}







