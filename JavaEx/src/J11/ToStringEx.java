package J11;

import java.util.Date;
public class ToStringEx {		// extends Object 생략
	public String toString() {
		return "재정의된 toString()";
	}
	public static void main(String[] args) {
		ToStringEx ts = new ToStringEx();
		System.out.println( "ToStringEx : " + ts );	// Object.toString		참조값 출력		
		
		String a = "ABC";
		System.out.println( "String : " + a );		// String.toString()	데이터 출력
		
		Date d = new Date();
		System.out.println( "Date : " + d );		// Date.toString()		날짜 출력
		
	}
}
