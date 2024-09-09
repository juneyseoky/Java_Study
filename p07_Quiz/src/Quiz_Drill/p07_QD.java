package Quiz_Drill;

import java.util.Scanner;

public class p07_QD {
	private static int br;
	private static Double kw;
	private static Double duty;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("용도별 코드를 입력하세요");
		System.out.print("(1 - 가정용, 2 - 산업용, 3 - 교육용 : ");
		int code = sc.nextInt();
		System.out.print("전기 사용량을 입력하세요(kw) : ");
		int used = sc.nextInt();		
		sc.close();
		electricitybill(code, used);
	}
	public static void electricitybill(int code,int used) {
		switch(code) {
		case 1: 
			br = 1250;
			kw = 107.5;
			duty = 0.08;
			break;
		case 2: 
			br = 580;
			kw = 80.4;
			duty = 0.06;
			break;
		case 3: 
			br = 340;
			kw = 61.0;
			duty = 0.04;
			break;
		}
		int elec = (int) (br+(used*kw)); 
		int total = (int) (elec+(elec*duty));
//		System.out.println((int)(total));
		System.out.println("--------------");
		System.out.println("전기요금은 "+total+"원입니다.");
		System.out.println("\nEnd");
	}
	

}
