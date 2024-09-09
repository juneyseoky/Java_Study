package qd01;

import java.text.DecimalFormat;


public class MyPay {
	private int pay;
	
	public MyPay(int pay) {
		this.pay= pay;
	}

	public void real() {
		DecimalFormat df = new DecimalFormat("#,###");
		int real = pay-(pay*33/1000);
				
		String realPay = df.format(real);
		System.out.printf("실지급액 : %s 원 \n\nEnd.",realPay);
	}
}
