package pkg;

import java.util.Scanner;

import another.Ref;

public class Main {
//	메인 클래스
//	참조 클래스를 사용하는 클래스
//	메인클래스만 다른 클래스를
//	참조할 수 있는 것은 아님.
//	모든 클래스가 서로를 참조할 수 있음

	public static void main(String[] args) {
		
		// 참조하고 싶으면 무조건 만들어야 하는 것
		// ==> 객체
		
		Scanner sc = new Scanner(System.in);
		System.out.print("전달할 값 입력 : ");
		int num = sc.nextInt();
		
		sc.close();
		
		Ref ref = new Ref(num); 	// 객체 생성 = 클래스의 사본을
					// 			   힙(Heap)에 만듬
					// 객체의 필드, 메서드 사용하려고 만듬
		
		System.out.println("필드 값(메서드로 우회) : " +ref.mtd()); 
		
	}

}
