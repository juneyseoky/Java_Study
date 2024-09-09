package J13;

import java.util.HashSet;

/*
Collection 		- Set		- HashSet
							- TreeSet
				- List		- ArrayList
							- Vector		- Stack
				- Queue		- LinkedList
Map				- HashMap
				- Hashtable
*/
public class HashSetEx {

	public static void main(String[] args) {
		// 객체 생성
		HashSet <String> hs = new HashSet <String>();
		
		// 추가 
		System.out.println("추가 : " + hs.add("우왕"));
		System.out.println("추가 : " + hs.add("굿드"));
		System.out.println("추가 : " + hs.add("나이숴~"));
		System.out.println("추가 : " + hs.add("진행시켜!"));
		System.out.println("추가 : " + hs.add("웃짜!"));
		System.out.println("추가 : " + hs.add("우왕"));
		
		// 삭제
		System.out.println("삭제 : " + hs.remove("우왕"));
		System.out.println("삭제 : " + hs.remove("우왕"));
		
		// 검색
		System.out.println("검색 : " + hs.contains("우왕"));
		
		// 출력
		for(String a : hs) {
			System.out.println("출력 : " + a);
		}
		
	}

}
