package qd04;

public class numRepeat {
	private int num;
	
	public numRepeat(int num) {
		this.num = num;
	}

	public void repeat() {
		int x = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {			
				if(x>num) {
					x=1;
				}
				System.out.print(x+" ");
				x++;
			}System.out.println();
		}
	}

}
