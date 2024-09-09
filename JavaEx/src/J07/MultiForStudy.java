package J07;

public class MultiForStudy {

	public static void main(String[] args) {
		// 1번
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<=i; j++ ) {
				System.out.print( "*" );
			}
			System.out.println();
		}
		System.out.println();
		
		// 2번
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<4-i; j++ ) {
				System.out.print( " " );
			}
			for( int j=0; j<=i; j++ ) {
				System.out.print( "*" );
			}
			System.out.println();
		}
		System.out.println();
		
		// 3번
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5-i; j++ ) {
				System.out.print( "*" );
			}
			System.out.println();
		}
		System.out.println();
		
		// 4번
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<i; j++ ) {
				System.out.print( " " );
			}
			for( int j=0; j<5-i; j++ ) {
				System.out.print( "*" );
			}
			System.out.println();
		}
		System.out.println();
		
		// 과제
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<4-i; j++ ) {
				System.out.print( " " );
			}
			for( int j=0; j<=i; j++ ) {
				System.out.print( "**" );
			}			
			System.out.println();
		}
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<i; j++ ) {
				System.out.print( " " );
			}
			for( int j=0; j<5-i; j++ ) {
				System.out.print( "**" );
			}		
			System.out.println();
		}
		
		
	}
}


/*
     01234 01234 
②  0     * *	 ①	
   1	** **
   2   *** ***
   3  **** ****
   4 ***** *****

     01234 01234
   0 ***** *****
   1  **** ****
   2   *** ***
   3    ** **
④  4     * *      ③
*/
/*
	① ② ③ ④번을 합쳐서 아래 모양을 만든다.
  
         **	
   		****
       ******
      ********
     **********
     **********
      ********
       ******
        ****
         **
*/





