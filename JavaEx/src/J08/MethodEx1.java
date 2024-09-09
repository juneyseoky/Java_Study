package J08;

// 메서드( Method )
// 독립된 프로그램
// 반복되는 내용을 묶어서 처리
// 반드시 호출한 곳으로 되돌아 온다.
// 인수는 개수에 상관없다.
// return 값이 없으면 void 다.
// return 값은 한 개 뿐이다. 

public class MethodEx1 {
	public void sub() {		// 선언 - 메서드를 알려주는 / 구현 - 메서드가 할 일을 정의
		System.out.println( "Hello Java!!!!!" );
		// return;
	}
	public static void main(String[] args) {
		MethodEx1 me = new MethodEx1();
		me.sub();			// 호출 - 메서드를 사용한다
		me.sub();
		me.sub();		
	}
}













