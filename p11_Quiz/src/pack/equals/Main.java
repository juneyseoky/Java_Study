package pack.equals;

public class Main {

	public static void main(String[] args) {
		
		String obj1 = "가나다라마바";
		String obj2 = "가나다라마바";
		
		if (obj1 == "가나다라마바") {
			System.out.println("객체가 같음");
		}else {
			System.out.println("객체가 다름");
		}
		usedEquals(obj1,obj2);
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
	}
	
	public static void usedEquals(String obj1, String obj2 ) {
		if(obj1.equals(obj2)) {
			System.out.println("usedEquals메서드 : 내용이 같음");
		}else {
			System.out.println("usedEquals메서드 : 내용이 다름");
		}
		
	}

}
