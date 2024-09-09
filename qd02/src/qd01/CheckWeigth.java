package qd01;

public class CheckWeigth {
	private String gender;
	private double kg;
	private double cm;
	
	public CheckWeigth(String gender,double kg, double cm) {
		this.gender = gender;
		this.kg = kg;
		this.cm = cm;
	}

	public void check() {
		double[] manVal = {20.0, 23.0};
		double[] wooVal = {18.5, 23.0};
		double[] Val = {};
		double bmi = (double)kg / ((Math.pow(cm/100,2)));// BMI) = 체중(kg) / [신장(m)]2
		if(gender.equals("m")){
			Val = manVal;		
		}else {
			Val = wooVal;
		}
		man(bmi, Val);
	}
	
	public void man(double bmi, double[] val) {
		String weight = "";
		if (bmi<val[0]) {
			weight="저체중";
		}else if(bmi>=val[0] && bmi < val[1]) {
			weight="평균체중";
		}else if(bmi>val[1])	{
			weight="과체중";
		}
		System.out.printf("당신의 BMI는 : %.1f\n",bmi);
		System.out.println(weight+"입니다\n\nEnd");
	}
	
//	public void woomen(double bmi) {
//		String weight = "";
//		if (bmi<18.5) {
//			weight="저체중";
//		}else if(bmi>=18.5 || bmi < 23.0) {
//			weight="평균체중";
//		}else if(bmi>23.0)	{
//			weight="과체중";
//		}
//		System.out.printf("당신의 BMI는 : %.1f\n",bmi);
//		System.out.println(weight+"입니다\n\nEnd");
//	}
//	
}
