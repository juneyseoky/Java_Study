package J10;

public class ArrayEx5 {
	public static final int SIZE = 5;
	public static void main(String[] args) {
		int m[][] = new int[ArrayEx5.SIZE][ArrayEx5.SIZE];	
		int cnt = 0;
		int a=ArrayEx5.SIZE/2, b=ArrayEx5.SIZE/2;
		for( int i=0; i<m.length; i++ ) {
			for(int j=a; j<=b; j++) {
				m[i][j] = ++cnt;
			}
			if(i < ArrayEx5.SIZE/2) {
				a--; b++;
			}else {
				a++; b--;
			}
			// for( int j=0; j<m[i].length; j++ ) {
				// m[i][j] = ++cnt;
				// m[j][i] = ++cnt;
				// if( i==ArrayEx5.SIZE/2 || j==ArrayEx5.SIZE/2 ) m[i][j] = ++cnt;
				// if( i==j || (i+j)==ArrayEx5.SIZE-1 ) m[i][j] = ++cnt;
				// if( i==0 || i==ArrayEx5.SIZE-1 || j==0 || j==ArrayEx5.SIZE-1 )
				//	m[i][j] = ++cnt;
				// if( ! ( i==0 || i==ArrayEx5.SIZE-1 || j==0 || j==ArrayEx5.SIZE-1 ) )
				//	m[i][j] = ++cnt;
				
			// }
			
//			if() {
//				for() {
//					
//				}
//			} else {
//				for() {
//					
//				}
//			}
		}
		for( int i=0; i<m.length; i++ ) {
			for( int j=0; j<m[i].length; j++ ) {
				System.out.print( m[i][j] + "\t" );
			}
			System.out.println();
		}

	}
}





