package J11;
// 상속전
// CellPhone	전화기능
// CaPhone		카메라기능
// Mp3Phone		MP3기능

// 상속후
// CellPhone	전화기능
// CaPhone		전화기능 + 카메라기능
// Mp3Phone		전화기능 + 카메라기능 + MP3기능

class CellPhone {		// 전화기능		
	private String model;
	private String tel;
	public CellPhone() {}
	public CellPhone( String model, String tel ) {
		System.out.println( "부모생성자" );
		this.model = model;
		this.tel = tel;
	}
	public String getModel() {
		return model;
	}
	public String getTel() {
		return tel;
	}	
} // CellPhone
class CaPhone extends CellPhone {	// 전화기능 + 카메라기능
	private int pixel;
	public CaPhone( String model, String tel, int pixel ) {
		super( model, tel );		// 부모생성자 호출		
		// this.model = model;
		// this.tel = tel;
		this.pixel = pixel;		
		System.out.println( "자식생성자" );
	}
	public int getPixel() {
		return pixel;
	}
} // CaPhone
class Mp3Phone extends CaPhone {	// 전화기능 + 카메라기능 + MP3기능
	private int chord;
	public Mp3Phone( String model, String tel, int pixel, int chord ) {
		super( model, tel, pixel );
		this.chord = chord;
	}
	public int getChord() {
		return chord;
	}	
} // Mp3Phone
public class InherEx {
	public static void main(String[] args) {
		// CellPhone ce = new CellPhone( "K-500", "1111-2222" );
		// System.out.println( "모델명 : " + ce.getModel() );
		// System.out.println( "전화번호 : " + ce.getTel() );
		
		// CaPhone ca = new CaPhone( "K-500", "1111-2222", 1024 );
		// System.out.println( "모델명 : " + ca.getModel() );
		// System.out.println( "전화번호 : " + ca.getTel() );
		// System.out.println( "화소 : " + ca.getPixel() );
		
		Mp3Phone mp = new Mp3Phone( "K-500", "1111-2222", 1024, 64 );
		System.out.println( "모델명 : " + mp.getModel() );
		System.out.println( "전화번호 : " + mp.getTel() );
		System.out.println( "화소 : " + mp.getPixel() );
		System.out.println( "화음 : " + mp.getChord() );
	}
}







