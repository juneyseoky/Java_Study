package J07;

/*
	2단		3단		...		9단
	2*1=2	3*1=3			9*1=9
	2*2=4	3*2=6			9*2=18
	2*3=6	3*3=9			9*3=27	
	...		...				...

*/
public class MultiForEx3 {

	public static void main(String[] args) {
		for( int i=2; i<10; i++ ) {
			System.out.print( i + "단" + "\t" );
		}		
		System.out.println();
		for( int i=1; i<10; i++ ) {			// 곱해지는 수			
			for( int j=2; j<10; j++ ) {		// 단
				System.out.print( j + "*" + i + "=" + i*j + "\t" );
			}		
			System.out.println();
		}		

	}

}






