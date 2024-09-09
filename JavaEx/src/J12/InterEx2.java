package J12;

// Interface 다중 상속

interface Inter2 {
	public int a=10;
	public int getA();
}
interface Inter3{
	public int b=20;
	public int getB();
}
interface Inter4 extends Inter2, Inter3 {		// interface끼리 상속할 시 exetends
	public int c=30;
	public int getC();
}
class InterSuper implements Inter4 {		
	// 구현할 의무를 떠 넘기면 추상클래스(abstract class)가 되어버린다.
	// 대신 구현만 하기 때문에 abstrack class로 만드는 경우도 있다.
	public int getC() {
		return c;
	}
	public int getB() {
		return b;
	}
	public int getA() {
		return a;
	}
}
public class InterEx2 extends InterSuper{		// 대신 구현한 클래스를 상속받아서 필요한 메소드만 재정의해서 사용
	// class 에서 interface를 상속할 시 implements
	// 상속한 Inter4는 Inter2, Inter3을 상속받았기에 모든 추상메소드를 구형해야만 한다.
	
	public static void main(String[] args) {
		InterEx2 ie = new InterEx2();
		System.out.println("a : " + ie.getA());
		System.out.println("b : " + ie.getB());
		System.out.println("c : " + ie.getC());

	}

}
