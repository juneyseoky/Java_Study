package star;

public class Star {
	private int num;
	
	public Star(int num) {
		this.num = num;
		
	}
	
	public void mtd() {
		
		System.out.println();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("\nEnd");
	}
}
