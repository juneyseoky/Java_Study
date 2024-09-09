package qd03;

public class Main {
	public static void main(String[] args) {
		
		for (int j = 0; j < 5; j++) {
			for(int i = 5; i > j; i--) {
				System.out.print("* ");				
			}
			System.out.println();
		}
		System.out.println("\nEnd");
	}
}
