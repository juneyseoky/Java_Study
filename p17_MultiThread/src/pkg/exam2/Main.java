package pkg.exam2;

public class Main {

	public static void main(String[] args) {
		LowerCase obj = new LowerCase();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("메인 스레드");
		for(int i = 0; i <=10; i++) {
			System.out.print(i);
		}
	}

}
