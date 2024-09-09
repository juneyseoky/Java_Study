package pkg.exam;

public class CountThread extends Thread{

	@Override
	public void run() {
		System.out.println("멀티 스레드");
		
		try {
		for(int i=1; i <= 10; i++) {
			System.out.print(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}
	
	

}
