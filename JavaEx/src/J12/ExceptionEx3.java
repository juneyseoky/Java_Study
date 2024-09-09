package J12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 사용자 정의 예외
// 정수를 입력받아서 구구단 출력
// 2~9사이가 아닌 경우에는 예외처리
class UserException extends Exception{

}
public class ExceptionEx3 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("단 입력 : " );
			int dan = Integer.parseInt(br.readLine());
			if(dan <2 || dan >9) {
				throw new UserException();				
			}else {
				for(int i=1; i<10; i++) {
					System.out.println(dan+"x"+ i + "=" + dan*i);
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}catch(UserException e) {
			System.out.println("2~9사이 숫자만 입력하세요~");
		}

	}

}
