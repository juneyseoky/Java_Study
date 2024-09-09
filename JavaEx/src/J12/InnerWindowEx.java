package J12;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class InnerWindowEx extends Frame /* implements WindowListener */ {
	public InnerWindowEx() {
		setBounds(700, 300, 300, 400);
		setVisible(true);
		
		addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				}
		);
		/*
		 * WindowAdapter wa = new WindowAdapter() { public void windowClosing(
		 * WindowEvent e) { System.exit(0); } }; addWindowListener(wa);
		 */
	}
	public static void main(String[] args) {
		new InnerWindowEx();
	}

}
