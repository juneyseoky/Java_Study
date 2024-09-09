package J07;
// 구구단 출력
public class MultiForEx2 {

	public static void main(String[] args) {
		
		for( int i=2; i<10; i++ ) {			// 단
			System.out.println( i + "단" );
			for( int j=1; j<10; j++ ) {		// 곱해지는 수
				System.out.println( i + " * " + j + " = " + i*j );
			}
			System.out.println();
		}
		
	}

}
