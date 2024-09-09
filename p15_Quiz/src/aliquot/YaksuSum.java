package aliquot;


public class YaksuSum extends YaksuList{
	
	public YaksuSum(int rndNum) {
		super(rndNum);
	}
	
	@Override
	public void mtdYaiksu() {
		int sum = 0;
		for(int i=1; i<=rndNum; i++) {
			if( rndNum % i == 0) {
				sum+= i;
			}
		}
		System.out.println("약수의 합: "+sum);
	}

}
