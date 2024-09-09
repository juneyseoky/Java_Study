package J10;

// 배열
// 같은 자료형의 모임
// 인덱스는 0부터 시작
// 연속적인 메모리 할당
// 자바에서는 배열도 객체

// C			int m[3];
//				int m[3] = { 10, 20, 30 }

// Java			int m[] = new int[3];
//				int m[] = new int[] { 10, 20, 30 }
//				int m[] = { 10, 20, 30 }

// JavaScript	let m = []
//				let m = [ 10, 20, 30 ];

public class ArrayEx1 {
	public static void main(String[] args) {
		int m[] = new int[5];
		int w[] = new int[] { 10, 20, 30, 40, 50 };
		int z[] = { 10, 20, 30, 40, 50 };
		
		z[2] = 99;
		
		for( int i=0; i<z.length; i++ ) {
			System.out.println( "z[" + i + "] : " + z[i] );
		}
		
		// 개선된 루프			1.5버전부터
		for( int a : z ) {	// 배열과 같은 자료형 : 배열이나 컬렉션만
			System.out.println( a );
		}
		
	}
}


















