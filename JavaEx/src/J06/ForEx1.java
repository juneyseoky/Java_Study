package J06;

/*
	// 제어문 //	
	// 조건문
	- if( 조건 ) 참;
	- if( 조건 ) 참;
	  else 거짓;
	- if( 조건 ) 참;
	  else if( 조건 ) 참;
	  ...
	  else 거짓;
	- switch( 값 ) {	조건자리에는 정수, 문자, 정수로 떨어지는 식만 올 수 있다
						1.7버전부터는 문자열도 올 수 있다
	  case : 실행문; break;
	  }
	
			
	// 반복문
	for
	while
	do ~ while
*/

/*
 상수			변하지 않는 값
 정수		연산 O
 실수		연산 O
 문자		연산 O
 문자열	연산 X
 */
public class ForEx1 {
	public static void main(String[] args) {
		for( int i=0; i<3;   i++ ) {
			// 초기값   조건    증감값
			// ① 0	  ② 0<3  ④ 1
			//		  ⑤ 1<3  ⑦ 2
			//        ⑧ 2<3  ⑩ 3
			//        ⑪ 3<3
			System.out.println( "i : " + i );
			// ③ i : 0
			// ⑥ i : 1
			// ⑨ i : 2
		} // for
	}
}
















