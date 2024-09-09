package J12;
import java.awt.Frame;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class InterWindowEx extends Frame implements WindowListener {
	public InterWindowEx() {
		this.setBounds(700, 300, 300, 400);
		this.setVisible(true);
		this.addWindowListener(this);		// 이벤트 감지기
	}
	
	// 이벤트 핸들러
	// WindowListener 추상메서드 재정의
	// 메서드 하나가 필요하더라도 빠짐없이 구현해야 한다.
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	
	public static void main(String[] args) {
		new InterWindowEx();

	}

}
