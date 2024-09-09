package J11;

// 오버라이드( 재정의 ) / 오버로드( 다중정의 ) 
class OvSuper extends Object {
	String name = "부모클래스";
	public String getName() {
		return name;
	}
}
public class OverrideEx extends OvSuper {
	String name = "자식클래스";
	public String getName() {		// 오버라이드 메서드
		return name;
	}
	public static void main(String[] args) {
		// 부모 클래스 참조변수 = 부모 클래스 인스턴스
		OvSuper os = new OvSuper();
		System.out.println( "os name : " + os.name );
		System.out.println( "os name : " + os.getName() );
		
		// 자식 클래스 참조변수 = 자식 클래스 인스턴스
		OverrideEx oe = new OverrideEx();
		System.out.println( "oe name : " + oe.name );
		System.out.println( "oe name : " + oe.getName() );
		
		// 부모 클래스 참조변수 = 자식 클래스 인스턴스		자동형변환(프로모션)
		os = new OverrideEx();
		System.out.println( "os name : " + os.name );
		System.out.println( "os name : " + os.getName() ); 
		
		// 자식 클래스 참조변수 = 부모 클래스 인스턴스 		강제형변환(디모션)
		oe = (OverrideEx) new OvSuper();		
		
	}
}










