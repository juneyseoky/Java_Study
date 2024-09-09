package pkg.exam;

public class Main {

	public static void main(String[] args) {
		CountThread ct = new CountThread();
		ct.start();
		System.out.println("메인 스레드");
		try {
			for (char ch = 'A'; ch <= 'Z'; ch++) {
				System.out.print(ch);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
