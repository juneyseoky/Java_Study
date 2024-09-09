package qd03;

public class binary {
	private int decimal;
	
	public binary(int decimal) {
		this.decimal = decimal;
	}

	public void changeB() {
		String bin = Integer.toBinaryString(decimal);
		int binInt = Integer.parseInt(bin);
		
		System.out.printf("%d의 2진수 : %08d \n\nEnd",decimal,binInt);
	}
	
	
}
