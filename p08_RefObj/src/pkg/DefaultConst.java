package pkg;

public class DefaultConst {
	// 참조 클래스
	// = 다른 클래스에서 활용되는 클래스
	private int num;
	// 디폴트 생성자의 정의는 생략할 수 있다.
	public DefaultConst() {	// 디폴트 생성자
		// = MAC(No Argument Constructor)
		// = 매개변수가 없는 생성자
		
	}
	public DefaultConst(int a) {	// 매개변수가 있는 생성자
		this.num = a;
	}
	// 단, 매개변수가 1개라도 있는 다른
	// 생성자가 있다면 디폴트 생성자는
	// 자동으로 생성되지 않는다.
	// 그래서 반드시 정의해야한다.
	public void mtd() {
		System.out.println(num);
	}
}
