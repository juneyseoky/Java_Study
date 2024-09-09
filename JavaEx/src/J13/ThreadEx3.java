package J13;


class BreadPlate {			// 공유하는 변수
	private int cnt;		// 빵의 재고
	public void make() {	// ++
		if(cnt>9) {
			System.out.println("빵이 남아~");
			try {
				wait();
			}catch( InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			cnt ++;
			System.out.println("빵 현재재고 : " + cnt);
			notifyAll();
		}
	}
	public void sell() {	// --
		if(cnt<1) {
			System.out.println("빵이 없어");
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			cnt --;
			System.out.println("빵 현재재고 : " + cnt);
			notifyAll();
		}
	}
}

class BreadMaker extends Thread {	// 생산
	private BreadPlate bp;
	public BreadMaker(BreadPlate bp) {
		this.bp = bp;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			bp.make();
		}
	}
}
class BreadSeller extends Thread {	// 소비
	private BreadPlate bp;
	public BreadSeller(BreadPlate bp) {
		this.bp = bp;
	}
	public void run() {
		for( int i=0; i<20; i++) {
			bp.sell();
		}
	}
}

public class ThreadEx3 {
	public static void main(String[] args) {
		BreadPlate bp = new BreadPlate();
		BreadMaker bm1 = new BreadMaker(bp);
		BreadMaker bm2 = new BreadMaker(bp);
		BreadSeller bs1 = new BreadSeller(bp);
		BreadSeller bs2 = new BreadSeller(bp);
		bm1.start();
		bm2.start();
		bs1.start();
		bs2.start();
	}

}
