package packRate;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("취업자 수 : ");
		int employedNum = 513;
		//System.out.print("졸업자 수 : ");
		int graduatedNum = 315;
		EmployRate em = new EmployRate(employedNum, graduatedNum);

		em.mtdCalc();
	}

}
