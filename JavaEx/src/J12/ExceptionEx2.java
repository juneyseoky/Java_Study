package J12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionEx2 {

	public static void main(String[] args) /* throws IOException */{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		try{
			System.out.println("정수 : " );
			a = Integer.parseInt(br.readLine());
			System.out.println("a : " + 100/a);
		}catch(IOException e) {
			e.printStackTrace();			
		}catch(NumberFormatException e) {
			System.out.println("정수로만 입력해주세요.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됩니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("프로그램 끝");
		}
		

	}

}
