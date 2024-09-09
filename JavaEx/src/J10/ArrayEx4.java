package J10;

public class ArrayEx4 {

	public static void main(String[] args) {
		int m[][] = new int[3][2];	// 3행 2열 빈배열
		int w[][] = { { 10, 20 }, { 30, 40 }, { 50, 60 } };	// 3행 2열

		// 2차원 배열은 1차원 배열을 겹친다.
		int a[] = { 10, 20 };
		int b[] = { 30, 40 };
		int c[] = { 50, 60 };
		int z[][] = { a, b, c };
		
		//	행	1	0	열
		//	0	20	10
		//	1	40	30	
		//	2	60 	50
		
		//	행	1	0	열
		//	2	60	50
		//	1	40	30	
		//	0	20 	10
		
		for( int i=w.length-1; i>=0; i-- ) {			// 행
			for( int j=w[i].length-1; j>=0; j-- ) {	// 열
				System.out.print( "w[" + i + "][" + j + "] : " + w[i][j] + "\t" );
			}
			System.out.println();
		}
	}

}




