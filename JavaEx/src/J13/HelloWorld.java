package J13;
public class HelloWorld {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("*");		
		MyThread mt2 = new MyThread("#");		
		mt1.start();		
		mt2.start();
		
		System.out.printf("%n[1].mt1:" + mt1.isInterrupted() + ", mt2:" + mt2.isInterrupted() + "]");
		
		threadSleep(Thread.currentThread(), 2000);
		mt1.interrupt();
		System.out.printf("%n[2].mt1:" + mt1.isInterrupted() + ", mt2:" + mt2.isInterrupted() + "]");
		
		threadJoin(mt2);
		System.out.printf("%n[3].mt1:" + mt1.isInterrupted() + ", mt2:" + mt2.isInterrupted() + "]");
		
	}
	
	static void threadSleep(Thread t, long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			System.out.printf("%n[4]." + t.toString() + "-인터럽트됨]");
			t.interrupt();
		}
	}
	static void threadJoin(Thread t) {
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class MyThread extends Thread {

	public MyThread(String string) {
		super(string);
	}

	public void run() {
		int count = 0;
		while (!this.isInterrupted()) {
			System.out.print(this.getName());
			HelloWorld.threadSleep(this, 500);

			count++;
			if (count == 20) {
				this.interrupt();
				System.out.printf("%n[5]." + this.toString() + "-인터럽트됨]");
			}
		}
	}
}
