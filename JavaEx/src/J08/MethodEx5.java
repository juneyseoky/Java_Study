package J08;

// return 
public class MethodEx5 {
	public int hap( int a, int b ) {
		// 결과형/반환형
		return a+b;		
	}
	public int cha( int a, int b ) {	
		return a-b;		
	}
	public int gop( int a, int b ) {	
		return a*b;		
	}
	public double mok( int a, int b ) {		
		return (double) a/b;
	}
	public static void main(String[] args) {		
		MethodEx5 me = new MethodEx5();
		
		// int sum = me.hap( 10, 20 );
		// System.out.println( "합 : " + sum );
		System.out.println( "합 : " + me.hap( 10, 20 ) );
		System.out.println( "차 : " + me.cha( 10, 20 ) );
		System.out.println( "곱 : " + me.gop( 10, 20 ) );
		System.out.println( "몫 : " + me.mok( 10, 20 ) );	// 소수점이 나오도록
	}
}





