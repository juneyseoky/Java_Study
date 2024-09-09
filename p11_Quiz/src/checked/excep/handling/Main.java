package checked.excep.handling;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		System.out.println("키보드의 키를 입력하고 엔터를 입력하면 입력한 키의 코드가 반환됩니다.");
		try {
			int keyCode = System.in.read();
			System.out.println("\n입력한 키의 키코드 : "+ keyCode);
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
