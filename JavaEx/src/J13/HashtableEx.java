package J13;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public class HashtableEx {

	public static void main(String[] args) {
		// 생성
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		// 추가
		if(! ht.containsKey(9)) ht.put(9, "홍길동");
		ht.put(0, "이순신");
		ht.put(7, "김유신");
		ht.put(1, "감강찬");
		ht.put(9, "유비");
		
		
		// 출력
		Enumeration<String> en = ht.elements();
		while( en.hasMoreElements()) {
			System.out.println(" Value : " + en.nextElement());
			
		}
		Enumeration<Integer> e = ht.keys();
		while( e.hasMoreElements()) {
			System.out.println(" Key : " + ht.get(e.nextElement()));
		}
		
		
		// 컬렉션
		// Set<Integer> s = ht.keySet();
		Iterator <Integer> it = ht.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(" Key : " + it.next());
			
		}
		
		Vector<String> ve = new Vector<String>(ht.values());
		
		System.out.println(ve);
		for (int i=0; i<ve.size(); i++) {
			System.out.println(" Vector : " +ve.get(i));
		}
		
	}

}
