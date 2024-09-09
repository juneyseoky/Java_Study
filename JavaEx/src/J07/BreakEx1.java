package J07;

public class BreakEx1 {
	public static void main(String[] args) {
		int i=0;
		while( true ) {
			i++;
			if( i>10 ) break;				// 반복문을 빠져나가라
			if( i%2 == 1 ) continue;		// 반복문의 처음으로 돌아가라
			System.out.println( "i : " + i );
		}
	}

}
