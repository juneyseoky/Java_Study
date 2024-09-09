package J13;

import java.util.Calendar;

class ThreadTest extends Thread{
	public ThreadTest(String name) {
		super(name);
	}
	public void run() {
		for( int i=0; i<5; i++) {
			Calendar cal = Calendar.getInstance();
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		
			System.out.println(
					Thread.currentThread().getName()
					+" : " + cal.get(Calendar.SECOND)
					);
		}
	}
}

public class TreadEx2 {
	public static void main(String[] args) {
		ThreadTest tt1 = new ThreadTest("첫번째");
		ThreadTest tt2 = new ThreadTest("두번째");
		ThreadTest tt3 = new ThreadTest("세번째");

		// 쓰레드 우선순위
		// tt1.setPriority(Thread.MAX_PRIORITY);
		// tt3.setPriority(Thread.MIN_PRIORITY);

		tt1.start();
		try {
			tt1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		tt2.start();
		tt3.start();
	}
}


