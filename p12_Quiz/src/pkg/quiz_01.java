package pkg;

import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Random;

public class quiz_01 {

	public static void main(String[] args) {
		int front = 0;
		int back = 0;
		int num = 0;
		Random ran = new Random();
		
		for(int i=0; i<100; i++) {
			num = ran.nextInt(2)+1;
			
			if(num ==1) front++; else back++;
		}
		System.out.println("앞면 : "+front);
		System.out.println("뒷면 : "+ back);
	}
	String text = "";
	StreamTokenizer token = new StreamTokenizer(new StringReader(text));

}
