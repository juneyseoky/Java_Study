package J08;

// 지역변수 / 전역변수
public class MethodEx2 {
	// 전역변수 / 멤버변수
	public void hap() {
		int sum=0;				// stack 	지역변수 	특정 영역 안에서 사용
		for( int i=1; i<11; i++ ) {			
			sum += i;
		}			
		System.out.println( "합 : " + sum );
	}
	public void gop() {
		int sum=1;				// stack 	지역변수 	특정 영역 안에서 사용
		for( int i=1; i<11; i++ ) {
			sum *= i;
		}
		System.out.println( "곱 : " + sum );
	}	
	public static void main(String[] args) {
		MethodEx2 me = new MethodEx2();
		me.hap();		// 1~10까지 합	55
		me.gop();		// 1~10까지 곱	3628800		
	}
}








