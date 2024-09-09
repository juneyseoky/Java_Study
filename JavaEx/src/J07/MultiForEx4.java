package J07;

public class MultiForEx4 {

	public static void main(String[] args) {
		for( int i=0; i<5; i++ ) {			// 0 ~ 4	행
			for( int j=0; j<5; j++ ) {		// 0 ~ 4	열
				System.out.print( i + "," + j + "\t" );
			}
			System.out.println();
		}
	}
}
