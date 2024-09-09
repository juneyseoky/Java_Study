package pkg.ex;

public class Main {

	public static void main(String[] args) {
		Test test = (num)-> {
			System.out.println("람다식 완성 !! ( 매개변수) : "+num);
			return "가나다";
		};
		String res = test.mtd(7);
		System.out.println(res);
	}
	
	

}
