package qd02;

public class Required {
	private double km;
	private double speed;
	
	public Required(double km, double speed) {
		this.km = km;
		this.speed = speed;
	}

	public void mtd() {
		
		double doubleTime = km / speed;
		
		int hour = (int) doubleTime;
		
		double minute = (doubleTime-hour) * 60;
		int minutes = (int) minute;
		int seconds = (int)((minute- minutes)* 60);
		
		System.out.printf("%02d시간 %02d분 %02d초 \n\n End", hour, minutes, seconds);
	}
	

}
