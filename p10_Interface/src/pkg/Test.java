package pkg;

public interface Test {
	
	public static void mtdStatic() {
		// 정적 메소드
	}
	
	public default void mtdDefault() {
		// 디폴트 메소드
	}
	
	public void mtdAbs();

}
