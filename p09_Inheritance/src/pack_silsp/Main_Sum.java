package pack_silsp;

public class Main_Sum {

	public static void main(String[] args) {
		double[] num = {2.4, -0.5, 7.7};
		Sum sum = new Sum(num);
		
		double re = sum.mtdSum();
		
		System.out.println("mtdSum of Class Sum : "+ re);

	}

}