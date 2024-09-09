package J13;

import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

// 쓰레드
// 프로세스		실행되고 있는 프로그램
// 코어			일꾼
// 멀티 프로세스	프로세스 여러개 
// 멀티 태스킹		여러가지 일을 동실에 실행
// TSS			시분할방식 Time Sharing System

// 프로세스	- 쓰레드
//			- 쓰레드
//			- 쓰레드

// 하나의 프로그램 안에서 여러가지 작업을 동시에 실행

// 쓰레드		클래스 하나 
// 			Thread 클래스를 상속
//			

class ThreadWindow extends JFrame implements Runnable{
	private static final long serialVersionUID = 1L;
	JLabel label = new JLabel("", JLabel.CENTER);
	public ThreadWindow() {
		setBounds(400, 300, 300, 400);
		setVisible(true);
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void run() {
		while(true) {
			Calendar cal = Calendar.getInstance();
			label.setText(
					cal.get(Calendar.HOUR_OF_DAY)
					+ " : " + cal.get(Calendar.MINUTE)
					+ " : " + cal.get(Calendar.SECOND));
		}		
	}
	
	
}

class ThreadConsole extends Thread{
	public void run() {
		int cnt = 0;
		while(true) {
			System.out.println(++cnt);
		}
	}

}

public class ThreadEx1 {

	public static void main(String[] args) {
		ThreadConsole tc = new ThreadConsole();
		ThreadWindow tw = new ThreadWindow();
		tc.start();
		Thread t = new Thread(tw);
		t.start();
	}
}


