package pack_quiz;

public class MaxDisplay extends Display {
	protected double max ;
	public MaxDisplay(double[] num) {
		super(num);
	}
	
	public void maxValue(double[] num) {
		
		
		for (int i = 0; i < num.length; i++) {
			if(max<num[i]) max = num[i];
			
		}
		System.out.println("최대값 : "+max);
		
		
	}

}
