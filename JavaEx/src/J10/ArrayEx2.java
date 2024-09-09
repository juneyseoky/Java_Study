package J10;

// Variable Argument			1.5버전 부터
public class ArrayEx2 {
	/*
	public int hap( int a, int b ) {
		return a+b;
	}
	public int hap( int a, int b, int c ) {
		return a+b+c;
	}
	*/
	public int hap( String a, int ... m ) {		// 배열	매개변수의 끝
		int sum=0;
		for( int i=0; i<m.length; i++ ) {
			sum += m[i];
		}
		return sum;
	}	
	public static void main(String[] args) {
		ArrayEx2 ae = new ArrayEx2();
		System.out.println( "합 : " + ae.hap( "A", 5, 2 ) );
		System.out.println( "합 : " + ae.hap( "B", 5, 2, 3 ) );
		System.out.println( "합 : " + ae.hap( "C", 5, 2, 3, 7 ) );
	}
}





