package J08;

/*
	객체지향 프로그래밍 OOP Object Oriented Programming 
	객체( Object ) - 부품			객체 위주로 프로그래밍 권장한다.
	클래스(설계도)로 메모리 할당
	
	프로그램			명령어들의 나열
	
	변수선언			메모리 할당
	int a=5;		변수. 메모리에 4byte 메모리할당 후에 a라는 이름을 붙여라
					a라는 이름은 메모리를 접근하는 방법중에 하나
					메모리접근하는 다른 방법 시작주소(포인터) 접근하는 방법이 있다
	String b = "A";	변수. 객체 생성.	
					클래스 내부에는 메서드(일 하나)가 많이 있다.
*/

/*
	클래스			캡슐화 상속 다형성
	C++ 클래스는 캡슐화(데이터의 안정성)때문에 만들었다
	
	C			C++
	~ 구조체	|	클래스
	
	
	물			우물					정수기					자판기
				속성(컵 / 변수) 	X	속성		O				속성			O
				행위(동작)		X	행위		X				행위(멤버함수)	O
	
	국어점수 		int kor;	배열		구조체 - 새로운 자료형 설계	클래스 캡슐화(데이터의 안정성)
				kor = 50;			struct Score {			접근제한자 멤버변수
				출력						int kor;			접근제한자 멤버함수(메서드)	
				int eng;				double avg;
				kor = -50;			};
									Score kim;	구조체변수		멤버변수에 직접 데이터를 넣을 수 없다.
									kim.kor = 50;			멤버함수를 통해서 데이터를 넣는다.
									출력						멤버함수가 데이터를 걸러내고 잘못된 데이터를 알려준다.
									Score lee;
									kim.kor = -50;
*/

/*
	Mp3p	속성		color
					memory
			행위		setColor		색상을 대신 입력
					setMemory		용량을 대신 입력
					getColor		색상을 대신 출력
					getMemory		용량을 대신 출력
*/	

public class Mp3p {	// 클래스는 설계도
	// 멤버변수
	private String color;
	private int memory;
	
	// 멤버함수
	public void setColor( String c ) {	// String c 	참조변수
		if( c.equals( "빨간색" ) || c.equals( "파란색" ) || c.equals( "노란색" ) ) {
			color = c;
		} else { 
			System.out.println( "지원하지 않는 색상입니다" );
		}
	}
	public void setMemory( int m ) {
		if( m == 128 || m == 256 || m == 512 ) {
			memory = m;
		} else {
			System.out.println( "지원하지 않는 용량입니다" );
		}
	}
	public String getColor() {
		return color;
	}
	public int getMemory() {
		return memory;
	}	
	public static void main(String[] args) {	// 멤버함수(메서드)
		// 객체 생성		메모리 할당
		Mp3p m3;			// 참조변수	heap 할당받은 공간의 참조값(포인터)를 저장
		m3 = new Mp3p();	// 인스턴스	heap 할당받은 데이터 저장 공간
		// 객체.멤버	참조변수.멤버 	인스턴스.멤버

		m3.setColor( "빨간색" );
		m3.setMemory( 128 );
		System.out.println( "색상 : " + m3.getColor() );
		System.out.println( "용량 : " + m3.getMemory() );
		
		Mp3p m4 = new Mp3p();
		m4.setColor( "검정색" );
		m4.setMemory( 1024 );
		System.out.println( "색상 : " + m4.getColor() );
		System.out.println( "용량 : " + m4.getMemory() );
		
	}
}

/*
	// 메모리		메모리 관리(메모리 반납) 때문에
	코드
	static		반납 X				static int a;
	heap		수동 반납(중간 반납)	new 		delete( C )		수동		
									new			JVM( Java )		자동
	stack		자동 반납				int a;		속한 영역이 끝나면 반납
	
	C는 객체를 stack, heap 할당받을 수 있다
	Java는 객체를 heap 영역에만 할당받는다.
	
*/



















