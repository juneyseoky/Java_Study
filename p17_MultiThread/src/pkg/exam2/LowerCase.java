package pkg.exam2;

public class LowerCase implements Runnable {
	
	@Override
	public void run() {
		System.out.println("로우 쓰레드");
		for(char ch = 'a'; ch <='z'; ch++) {
			System.out.print(ch);
		}
	}
}
