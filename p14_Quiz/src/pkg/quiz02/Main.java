package pkg.quiz02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("숫자 입력(1000~99999) : " );
			int str = sc.nextInt();
			
			valuesClac valC = new valuesClac(str);
			valC.indexValues();
			valC.valuesSum();
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("\nPrint OK!");
		}

	}

}
