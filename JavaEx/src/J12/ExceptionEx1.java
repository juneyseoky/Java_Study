package J12;

//	C          에러		경고		예외 정의x
// java		   에러		에러 		예외 정의o
// 예외처리
public class ExceptionEx1 {
	public static void main(String[] args) {
		int m[] = {10, 20, 30};
		try {
			for (int i=0; i<m.length + 1; i++) {
				System.out.println(" m [" + i + "] :" + m[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) { // e 참조변수이다(값을 저장하는 변수)
				System.out.println("에러다에러~");
				e.printStackTrace();
		}finally {		// 예외가 있건 없건 실행되는 블럭
			System.out.println("프로그램 종료");
		}
			
	}

}

