package J07;

// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
public class DoWhileEx3 {
	public static void main(String[] args) {
		int i=0, sum=0;
		do {
			i++;
			sum += i;
			if( i<10 )
				System.out.print( i + " + " );
			else 
				System.out.print( i + " = " );			
		} while( i<10 );
		System.out.println( sum );		
	}
}
