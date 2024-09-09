package pkg.drill;

public abstract class Main {

	public static void main(String[] args) {
		
		Calc calc = (a,b) -> (a+b) / 2.0;
		
		double res = calc.mtdAvg(5, 2);
		
		System.out.println(res);
	}

}
	