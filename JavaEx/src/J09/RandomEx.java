package J09;

import java.util.Random;
public class RandomEx {
	public static void main(String[] args) {
		// 클래스 사용법
		// 1. 객체 생성			X
		// 2. 상속				X
		// 3. 멤버 모두가 static 	O

		// Math m = new Math();	// 기본생성자 private
		
		System.out.println( (int) ( Math.random() * 45 ) + 1 );	// 2 ~ 45
		//										범위의 개수  시작값
		// non-static 	객체.멤버
		// static		클래스명.멤버
		
		Random r = new Random();
		System.out.println( r.nextInt( 46 ) );
		
	}
}









