package J09;

// 생성자 / this 

// 생성자 Constructor		소멸자(메모리 정리 함수) Destructor는 없다.
// 생성자는 메서드다.
// 클래스명과 동일하다.
// 결과형 반환형이 없다.
// 구현하지 않으면 default 가 실행된다.
// 객체 생성시 자동 호출 된다. 수동 호출은 안 된다.
// 객체 초기화에 사용된다. 

public class ConstructorEx {
	private String name;
	private int age;
	public void setName( String name ) {
		this.name = name;
	}
	public void setAge( int age ) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {		
		return age;
	}	
	
	// 생성자
	public ConstructorEx() {						// Default 생성자	
		System.out.println( "기본 생성자" );
	}	
	public ConstructorEx( String name, int age ) {	// 생성자 오버로드
		System.out.println( "생성자" );
		this.name = name;		// 멤버변수(전역변수) = 매개변수(지역변수)
		this.age = age;
	}	
	public static void main(String[] args) {
		ConstructorEx ce1 = new ConstructorEx();	// default 생성자 호출
		// ce1.setName( "홍길동" );
		// ce1.setAge( 30 );
		System.out.println( "이름 : " + ce1.getName() );
		System.out.println( "나이 : " + ce1.getAge() );
		
		ConstructorEx ce2 = new ConstructorEx( "이순신", 30 );		
		System.out.println( "이름 : " + ce2.getName() );
		System.out.println( "나이 : " + ce2.getAge() );
		
		// OOP
		// 객체를 생성하면 무조건 생성자가 호출된다. 
		// 가져다 쓰는 클래스 생성자부터 확인
		
	}
}




















