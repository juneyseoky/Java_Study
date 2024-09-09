package J08;
// 접근제한자 접근수정자 접근지정자
// public protected default private

// 클래스					public default(안 쓰는게 default) 	
// 멤버변수 / 멤버함수		public protected default private

class Encap {			// default
	private int a=10;
	protected int b=20;
	int c=30;			// default
	public int d=40;	
	public int getA() {
		return a;
	}
}
public class EncapEx {
	private int aa=1;
	protected int bb=2;
	int cc=3;
	public int dd=4;
	public static void main(String[] args) {
		EncapEx ee = new EncapEx();
		System.out.println( "EncapEx aa : " + ee.aa );
		System.out.println( "EncapEx bb : " + ee.bb );
		System.out.println( "EncapEx cc : " + ee.cc );
		System.out.println( "EncapEx dd : " + ee.dd );		
		
		Encap ec = new Encap();		// 클래스의 접근제한자에 영향을 받는다.
		// System.out.println( "Encap a : " + ec.a );	// private		같은 멤버만 접근
		System.out.println( "Encap a : " + ec.getA() );
		System.out.println( "Encap b : " + ec.b );		// protected	상속을 받았거나 같은 패키지인 경우만 접근
		System.out.println( "Encap c : " + ec.c );		// default		같은 패키지만 접근
		System.out.println( "Encap d : " + ec.d );		// public		아무나 접근 가능	
	}
}









