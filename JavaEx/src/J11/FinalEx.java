package J11;

// final
// 변수		값을 변경할 수 없다
// 메서드		오버라이드를 할 수 없다
// 클래스		상속받을 수 없다

/*final*/ class FinalSuper {	// 상속을 할 수 없다.
	static final int a=10;		// 초기화를 해야 한다. 상수화된다.
	public /*final*/ int getA() {	// 재정의 할 수 없다.
		return a;
	}
}
public class FinalEx extends FinalSuper {
	public int getA() {			// 오버라이드를 할 수 없다.
		return a;
	}
	public static void main(String[] args) {
		// FinalSuper.a = 20;	// 값을 변경할 수 없다.
		
	}
}
