package J06;

// 숫자 두 개와 연산자( + - * / % ) 한 개를 입력받는다.
// 입력받은 연산자로 입력받은 숫자를 계산한 후 출력한다.
// 단, 나눗셈은 실수로 출력한다.
// + - * / % 이외에는 "잘못입력" 출력
// ex)	입력 :		2 5 + 
//		출력 :		2 + 5 = 7

import java.util.Scanner;
public class SwitchStudy {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner( System.in );
		
		System.out.print( "정수 : " );
		int a = input.nextInt();

		System.out.print( "정수 : " );
		int b = input.nextInt();
		
		System.out.print( "연산자( + - * / % ) : " );
		String c = input.next();
		
		input.close();
		switch( c ) {
		case "+" : System.out.println( a + c + b + " = " + (a+b) ); break;
		case "-" : System.out.println( a + c + b + " = " + (a-b) ); break;
		case "*" : System.out.println( a + c + b + " = " + (a*b) ); break;
		case "/" : System.out.println( a + c + b + " = " + ( (double)a/b) ); break;
		case "%" : System.out.println( a + c + b + " = " + (a%b) ); break;
		default : System.out.println( "잘못입력" );
		}
		
	}
}









