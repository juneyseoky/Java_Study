package J07;

public class MultiForEx1 {
	public static void main(String[] args) {
		for( int i=0; i<3; i++ ) {			// 0 1 2
			for( int j=0; j<3; j += 2 ) {	// 0 2
				System.out.println( "i : " + i + "\t" + "j : " + j );	
				//	0	0
				//	0	2
				//	1	0
				//	1	2
				//	2	0
				//	2	2
				
			} // for j
		} // for i
		
	}
}
