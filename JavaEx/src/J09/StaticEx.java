package J09;

// Static
// static 영역에 할당된다. ( static / heap / stack )
// 다른 멤버보다 먼저 할당된다.
// static 메서드는 static 변수만 호출할 수 있다. 
// 객체없이 접근 가능하다. 
// 자동 초기화 된다. 초기화는 한번 만 수행한다.
// 모든 객체(Object)들이 사용 할 수 있도록 공유개념을 가진다.
// 클래스 변수 / 클래스 메서드라고도 한다. 

public class StaticEx {
	private int a=10;			// non-static	객체.멤버
	private static int b=20;	// static		클래스명.멤버
	// static 	클래스변수 <- 공유하니까 <- 한 번만 할당되니까 <- 먼저 할당되니까
	static {
		// 최초에 한 번만 해야하는 작업들	
		int c = 30;			// 지역변수
		System.out.println( "c : " + c );
	}
	public static void main(String[] args) {
		// static 메모리 할당	- 자동 초기화 된다.
		
		StaticEx se1 = new StaticEx();
		System.out.println( "a : " + se1.a );
		System.out.println( "b : " + b );	
		System.out.println( "b : " + se1.b );
		System.out.println( "b : " + StaticEx.b );
		
		se1.a += 10;
		se1.b += 10;
		System.out.println( "a : " + se1.a );
		System.out.println( "b : " + se1.b );
		
		StaticEx se2 = new StaticEx();
		se2.a += 10;
		se2.b += 10;
		System.out.println( "a : " + se2.a );
		System.out.println( "b : " + se2.b );	
		
	}
}









