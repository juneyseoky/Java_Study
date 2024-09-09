package J11;

// 추상클래스	 abstract
// 추상 메서드를 하나라도 가지면 추상 클래스가 된다. 
// 추상 메서드는 구현하지 않는다. 
// 추상 클래스임을 명시해야 한다. 
// 객체를 생성할 수 없다. 항상 상속으로 구현된다.
// 상속 시 추상 메서드는 구현해야 한다. 
// 일반 변수 메서드 상수를 가질 수 있다. 

// 추상클래스, 인터페이스는 틀을 정할때 사용한다.

abstract class AbstractSuper {		// 추상클래스		명시해야 한다.
	int a = 10;
	public abstract int getA();		// 추상메서드		구현할 수 없다.		
}
public class AbstractEx extends AbstractSuper {
	public int getA() {				// 추상메서드를 재정의해야 한다.
		return a;
	}
	public static void main(String[] args) {
		// AbstractSuper as = new AbstractSuper();		// 인스턴스 생성을 할 수 없다. 미완성이기 때문에
		AbstractEx ae = new AbstractEx();
		System.out.println( "a : " + ae.getA() );
	}
}







