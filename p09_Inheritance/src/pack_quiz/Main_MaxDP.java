package pack_quiz;

import java.util.Scanner;

public class Main_MaxDP {

	public static void main(String[] args) {
		double[] num = new double[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("값 3개를 입력하세요 : " );
		for(int i=0; i<num.length; i++){
			num[i] = sc.nextDouble();
		}
		sc.close();
		MaxDisplay dis = new MaxDisplay(num);
		System.out.println("입력 값은 다음과 같습니다.");
		dis.inputDouble(num);
		dis.maxValue(num);
	}
//	public static void main(String[] args) {
//		List<Double> num = new ArrayList<Double>();
//		Scanner sc = new Scanner(System.in);
//		System.out.print("값을 입력하세요 : " );
//		while(true) {
//			num.add(sc.nextDouble());
//			if(sc.nextLine().equals("x")) break;
//		}
//		sc.close();
//		MaxDisplay dis = new MaxDisplay(num);
//		System.out.println("입력 값은 다음과 같습니다.");
//		dis.inputDouble(num);
//		dis.maxValue(num);
//	}

}
