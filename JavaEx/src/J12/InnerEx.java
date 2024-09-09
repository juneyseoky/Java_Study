package J12;
// 내부클래스				Inner Class
// Member				멤버 변수나 멤버 메서드들과 같이 클래스가 정의
// 외부 클래스의 멤버를 참조할 수 있다.
// static 변수를 가질 수 없다.
// 객체를 생성하기 위해서는 외부 클래스의 객체를 먼저 생성해야 한다.

// Local				특정한 메서드 내에 클래스가 정의된 경우
// 간단한 기능을 갖는 임시 클래스로 사용
// 메소드 내부에서 선언되고 메소드 안에서만 객체화 할 수 있다.
// 메소드 외부에서는 사용할 수 없다.
// 접근수정자를 사용할 수 없다.

// Static				클래스가 static으로 선언된 경우
// static변수를 가지고 있다면 클래스는 static으로 선언해야 한다.
// 외부 클래스의 static 멤버만 참조할 수 있다.

// Anonymous 			참조할 수 있는 이름이 없는 경우
// 한 번만 사용하고 버려야 할 객체의 경우

/*
	Class Outer		- int a 
					- disp()	 - class InnerLocal		- int c
														- disp()
					- class InnerMember				- int b
													- disp()
					- static class InnerStatic 		- static int d
													- disp()
	abstract class Inneranony 	- int e
								- disp()
													
*/
class Outer {
	private int a=10;
	public void disp() {
		System.out.println("Outer a : " + a);
		
		/////////////// Local Inner Class /////////////////
		class InnerLocal {
			private int c=30;
			public void disp() {
				System.out.println("InnerLocal a : " + a);
				System.out.println("InnerLocal c : " + c);
			}
		}
		InnerLocal il = new InnerLocal();
		il.disp();
	}
	/////////////// Member Inner Class /////////////////
	class InnerMember{
		private int b=20;
		public void disp() {
			System.out.println("InnerMember a : " + a);
			System.out.println("InnerMember b : " + b);
		}
	}// class InnerMember
	
	/////////////// Static Inner Class /////////////////
	static class InnerStatic {
		private static int d=40;
		public void disp() {
			// System.out.println("InnerStatic a : " + a);
			System.out.println("InnerStatic d : " + d);
		}
	}
	
} // class Outer

abstract class InnerAnony {
	int e = 50;
	public abstract void disp();
}
public class InnerEx {
	public static void main(String[] args) {
		// Member Inner Class 
		Outer out = new Outer();
		Outer.InnerMember im = out.new InnerMember();
		Outer.InnerMember in = new Outer().new InnerMember();
		in.disp();
		
		// Local Inner Class
		out.disp();
		
		// Static Inner Class
		Outer.InnerStatic is = new Outer.InnerStatic();
		is.disp();

		// Anonymous Inner Class
		InnerAnony ia = new InnerAnony() {
			public void disp() {
			System.out.println("InnerAnony e : " + e);
			}
		};
		ia.disp();
		
		new InnerAnony() {
			public void disp() {
				System.out.println("InnerAnony e : " + e);				
			}
		}.disp(); // 일회성 메소드
		
	}

}
