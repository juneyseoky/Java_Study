package J12;

// 제네릭 / 컬렉션

// 배열은 연속인 메모리 할당 - 연속적인 메모리 존재해야 한다. 삽입 삭제 x
// 배열은 반복문 적용하기가 용이
// 대량의 데이터길이가 고정인 경우는 배열을 사용

// 컬렉션은 불연속적인 공간을 연속화 시켜준다.
// 삽입 삭제가 가능하다.

// 컬렉션은 자료형이 달라도 동일한 작업이 가능해야 한다.
// 클래스를 설계할때는 자료형을 정하지 않고 객체를 생성할 때 자료형을 정한다.


/*class Generic{
	private int a;
	public Generic(int a) {
		this.a = a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}
}*/
/*class Generic{
	private Object a;				// 모든 객체는 다 받아준다.
	public Generic(Object a) {
		this.a = a;
	}
	public void setA(Object a) {
		this.a = a;
	}
	public Object getA() {
		return a;
	}
}*/
class Generic <T>{		 
	private T a;
	public Generic( T a ) {
		this.a = a;
	}
	public void setA(T a) {
		this.a = a;
	}
	public T getA() {
		return a;
	}
	
}
public class GenericEx {

	public static void main(String[] args) {
		Generic <Integer> ge1 = new Generic <Integer>(10);
		System.out.println( "ge1 a : " + ge1.getA());
		
		Generic <Double> ge2 = new Generic <Double>(10.5);
		// ge2.setA("ADv"); 			// 객체 하나에 여러 자료형을 섞어 사용할수 없다.
		System.out.println( "ge2 a : " + ge2.getA());
//		Generic ge1 = new Generic(10);		// 오토박싱/언박싱
//		System.out.println("ge1 a : " + ge1.getA());
//		
//		Generic ge2 = new Generic( 19.5);
//		ge2.setA("ASD");
//		System.out.println(" ge2 a : " + ge2.getA());
	}

}
