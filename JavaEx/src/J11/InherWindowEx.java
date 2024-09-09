package J11;

import java.awt.Frame;
// 2. 상속
public class InherWindowEx extends Frame {
	public InherWindowEx() {
		super( "윈도우" );
		setBounds( 700, 300, 300, 400 );
		setVisible( true );
	}	
	public static void main(String[] args) {
		// 1. 객체생성
		// Frame f = new Frame();
		// f.setBounds( 700, 300, 300, 400 );
		// f.setVisible( true );	
		
		new InherWindowEx();
		
		// InherWindowEx iw = new InherWindowEx();
		// iw.setBounds( 700, 300, 300, 400 );
		// iw.setVisible( true );
	}
}
