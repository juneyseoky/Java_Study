package J10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class ArrayEx3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br
			= new BufferedReader( new InputStreamReader( System.in ) );
		
		int m[] = new int[5];
		for( int i=0; i<m.length; i++ ) {
			System.out.print( "정수 : " );
			m[i] = Integer.parseInt( br.readLine() );
		}

		// 최대값
		int a = m[0];
		for( int i=0; i<m.length; i++ ) {
			if( a < m[i] ) a = m[i];
		}		
		System.out.println( "최대값 : " + a );
		
		// 최소값
		a = m[0];
		for( int i=0; i<m.length; i++ ) {
			if( a >m[i] ) a = m[i];
		}		
		System.out.println( "최소값 : " + a );
		
		// 등수 구하기
		int rank[] = new int[5];
		for( int i=0; i<m.length; i++ ) {		// 기준
			rank[i] = 1;						// 가정 	기준방이 1등이다
			for( int j=0; j<m.length; j++ ) {	// 비교
				if( m[i] < m[j] )				// 기준 < 비교 
					rank[i] ++;
			}
		}		
		for( int i=0; i<rank.length; i++ ) {
			System.out.println( "m[" + i + "] 등수 : " + rank[i] );
		}
		
		// 정렬( 오름차순 / 내림차순 ) - 선택정렬( Selection Sort )
		int temp = 0;
		for( int i=0; i<m.length-1; i++ ) {			// 기준	전체방보다 하나 적게
			for( int j=i+1; j<m.length; j++ ) {		// 비교	기준 다음방 부터
				// if( m[i] > m[j] ) {				// 기준 > 비교	오름차순
				if( m[i] < m[j] ) {					// 기준 < 비교	내림차순
					temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
		}
		for( int i=0; i<m.length; i++ ) {
			System.out.println( "m[" + i + "] : " + m[i] );
		}
		
		Arrays.sort( m );
		for( int i=0; i<m.length; i++ ) {
			System.out.println( "m[" + i + "] : " + m[i] );
		}
		
	}
}











