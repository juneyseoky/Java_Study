package p08_singleton;

public class Ref_Singleton {
	// 싱글톤 패턴을 적용할 클래스
	
	private static Ref_Singleton obj = new Ref_Singleton();
	// Heap에 객체를 만들지 않고 Static 메모리 영역의	
	// 클래스에 존재한다.
	
	public static Ref_Singleton getInstance() {
		return obj;
	}
}
