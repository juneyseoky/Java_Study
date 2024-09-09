package pack.io;

import java.io.File;
import java.util.Scanner;

public class FileMgr {

	public static void main(String[] args) {
		
		File file = new File("C:/Temp/sample.txt");
		
		System.out.println("파일정보");
		System.out.println("--------------");
		System.out.println("파일존재여부 :"+ file.exists());
		System.out.println("파일명 :"+file.getName());
		System.out.println("파일 크기 : "+file.length());
		System.out.println("마지막 수정시간 : "+ file.lastModified());
		
		System.out.println("파일 삭제 실행");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("파일을 삭제하시겠습니까?(y/n) : ");
		String check = sc.next();
		if(check.equals("y")) {
			System.out.println("사용자가 파일을 삭제함");
			file.delete();
		}else {
			System.out.println("사용자가 삭제를 취소함");
		}

		sc.close();
		
	}

}
