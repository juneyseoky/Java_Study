package Chap_01;

public class exam01 {

	public static void main(String[] args) {
		String value1 = "자바";
		String value2 = "자비";
		
		if(value1 == value2) {
			System.out.println("참조가 같다");
		}else{
			System.out.println("다르다");
		}
		
		if(value1.equals(value2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}

	}

}
