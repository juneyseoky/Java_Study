package wrapper;

public class Ref {
	
	private String str1;
	private int sum;
	public Ref(String str1, int sum) {
		this.str1 = str1;
		this.sum = sum;
	}

	public void mtd() {
		System.out.println(str1+" = "+sum);
		System.out.println("\n\nEnd");
	}

}
