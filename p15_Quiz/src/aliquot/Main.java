package aliquot;


public class Main {

	public static void main(String[] args) {

		int num =(int) (Math.random() * (30 - 20 +1)) + 20;
		System.out.println("생성된 값 : "+num);
		System.out.println();

		Yaksu objSuper = new YaksuList(num);
		Yaksu objSub = new YaksuSum(num);
		
		objSuper.mtdYaiksu();
		objSub.mtdYaiksu();
		
		System.out.println("\nEnd");
	}

}
