package J13;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// 객체 생성
		Vector <String> v = new Vector <String>(5, 3);
		HashSet<String> hs = new HashSet<String> ();
		
		// 추가 Vector 중복된 값을 추가가능 
		System.out.println(" 추가 : " + v.add("홍길동"));
		System.out.println(" 추가 : " + v.add("이순신"));
		System.out.println(" 추가 : " + v.add("김유신"));
		System.out.println(" 추가 : " + v.add("홍길동"));
		v.addElement("대조영");
		v.add(2,"강감찬");
		v.insertElementAt("안중근", 3);
		
		System.out.println(" 용량 : " + v.capacity());
		System.out.println(" 크기 : " + v.size());
		
		// 삭제
		hs.add("강감찬");
		hs.add("홍길동");
		hs.add("연개소문");
		
		System.out.println(" 삭제 : " + v.removeAll(hs));
		// 출력
		for (int i=0; i<v.size(); i++) {
//			System.out.println(" 출력 : " + v.elementAt(i));
			System.out.println(" 출력 : " + v.get(i));
		}
		
		// 배열 
		String m[] = new String[v.size()];
		v.copyInto(m);
		for(int i=0; i<m.length; i++) {
			System.out.println(" 배열 : " + m[i]);
		}
		
		// trim
		System.out.println(" 용량 : " + v.capacity());
		System.out.println(" 크기 : " + v.size());
		v.trimToSize();
		System.out.println(" 용량 : " + v.capacity());
		System.out.println(" 크기 : " + v.size());
		
		// 클래스 사용법
		// 객체를 생성해서 객체,멤버
		// 상속받아서 부모 멤버를 내 멤버처럼 사용
		// 멤버 전체가 static인 경우 클래스명.멤버
		// 객체를 생성해 주는 static 메서드를 통해서 객체 생성
		// 자식클래스 객체를 생성해서 참조값을 받아서 사용
		// Class.forName(클래스 풀경로) 객체를 생성
		
		
		// 인터페이스 사용법
		// implements(상속)해서 메서드를 빠짐없이 재정의
		// 대신 구현한 클래스를 상속받아서 필요한 메서드만 재정의(오버라이딩)
		// 익명 내부클래스를 이용해서 미완성 부분을 구현하여 객체 생성
		// 인터페이스 객체를 생성해서 리턴시켜주는 메서드를 사용
		// 인터페이스를 상속받은 자식클래스로 객체 생성하여 참조값을 받아서 사용

		
		
		// 열거자 / 반복자
		// Iterator			위치값만 생성
		Iterator <String> it = v.iterator();
		while(it.hasNext()) {
			System.out.println( " Iterator : " + it.next());
		}
		
		
		// Enumeration		복사본을 생성
		Enumeration<String> en = v.elements();
		while(en.hasMoreElements()) {
			System.out.println( "Enumeration : " + en.nextElement());
		}
	}

}
