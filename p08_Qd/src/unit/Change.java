package unit;

public class Change {
	private int dis;
	private String unit;
	
	public Change(int dis, String unit) {
		this.dis = dis;
		this.unit = unit;
	}

	public void mtd() {
		double res = 0.0;
		String units = "";
		if(unit.equals("km")) {
			res = dis * 0.621371192237;
			units = "mile";
		}else if(unit.equals("mile")) {
			res = dis * 1.609344;
			units = "km";
		}
		System.out.printf("%s %s = %.2f %s \n\nEnd", dis, unit, res, units);
	}
	
}
