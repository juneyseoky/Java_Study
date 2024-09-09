package pkg;

public class Main {
	public static void main(String[] args) {
		mtdWrap(new Double(2.4));
	}
	
	private static void mtdWrap(Double double1) {
		System.out.println(double1); // 
		double a = double1.doubleValue();
		System.out.println(a);
	}

}
