package J12;

//인터페이스 ionterface
//interface 키워드를 사용한다
//상수와 추상 메소드로만으로 구성된다.
//final, sbstract 키워드를 따로 붙이지 않는다.
//interface는 객체를 생성할 수 없다.
//상속 시 implements(구현) 키워드를 사용한다.
//상속 시 추상 메소드는 빠짐없이 구현해야 한다.
//다중 상속이 가능하다.

interface Inter1 {
	public int a=10;		// static final 	초기값을 할당해야 한다.
	public int getA();		// abstract			구현하지 않는다.
}
public class InterEx1 implements Inter1{
	public int getA() {
		return a;
	}
	public static void main(String[] args) {
//		Inter1 in = new Inter1();				// 인스턴스를 생성할 수 없다.
		InterEx1 ie =new InterEx1();
		System.out.println("a : " + ie.getA());
	}

}
