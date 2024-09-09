package another;

public class Ref {
	// 참조 클래스
	// = 다른 클래스에서 활용되는 클래스
	
	private int num = 5;
	
	public Ref(int a) {	// 생성자 (=객체 생성)
		this.num = a;
	}
	
	public int mtd() {
		return num;
	}
}
