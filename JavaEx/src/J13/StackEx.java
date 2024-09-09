package J13;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// 객체 생성
		
		Stack <String> s = new Stack <String> (); // 먹고 토하고 먹고 토하고
		String group[] = { "대한민국", "사우디", "대만", "일본"};
		
		/*
		 			배열		스택		벡터
		 	일본		3		1		3
		 	대만		2		2		2
		 	사우디	1		3		1
		 	대한민국	0		4		0

		 */
		
		// 데이터 추가
		for( String g : group) {
			System.out.println("추가 : " + s.push(g));
		}
		
		// 검색
		int sau = s.search("사우디");
		System.out.println("검색 : " + sau);
		
		// 삭제
		System.out.println("삭제 : " + s.remove(sau));
		System.out.println("삭제 : " + s.remove("사우디"));
		// 출력
		while(!s.empty()) {
//			System.out.println("출력 : " + s.peek());
			System.out.println("출력 : " + s.pop());
		}

	}

}
