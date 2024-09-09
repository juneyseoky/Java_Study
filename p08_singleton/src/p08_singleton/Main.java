package p08_singleton;

public class Main {
	public static void main(String[] args) {
		
		Ref_Singleton ref1 = Ref_Singleton.getInstance();
		Ref_Singleton ref2 = Ref_Singleton.getInstance();
		
		System.out.println("ref1 : " + ref1);
		System.out.println("ref2 : " + ref2);
		if(ref1 == ref2) {
			System.out.println("싱글톤 객체 주소동일");
		}else {
			System.out.println("싱글톤 객체 주소다름");
		}
		
		System.out.println("\n-----------------------------\n");
		
		Ref_Normal ref3 = new Ref_Normal();
		Ref_Normal ref4 = new Ref_Normal();
		System.out.println("ref1 : " + ref3);
		System.out.println("ref2 : " + ref4);
		if(ref3 == ref4) {
			System.out.println("인스턴스 객체 주소 동일");
		}else {
			System.out.println("인스턴스 객체 주소 다름");
		}
		
	}

}
