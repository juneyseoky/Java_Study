package J11;

abstract class Design {
	int a=5, b=7;		// 밑변, 높이
	int c=10;			// 반지름
	double area;		// 넓이
	public abstract void calc();	// 넓이 계산
	public abstract void disp();	// 넓이 출력
}
class Rect extends Design {			// 사각형의 넓이
	public void calc() {
		area = a * b;
	}
	public void disp() {
		System.out.println( "사각형의 넓이 : " + area );
	}
}
class Tri extends Design {			// 삼각형의 넓이
	public void calc() {		
		area = a * b / 2.0;
	}
	public void disp() {	
		System.out.println( "삼각형의 넓이 : " + area );
	}
}
class Circle extends Design {		// 원의 넓이
	public void calc() {	
		area = c * c * Math.PI;
	}
	public void disp() {		
		System.out.println( "원의 넓이 : " + area );
	}
}
public class PolyEx {
	public static void main(String[] args) {
		Design de[] = { new Rect(), new Tri(), new Circle() };
		for( Design d : de ) {
			d.calc();
			d.disp();
		}
		
		/*
		Rect r = new Rect();
		Tri t = new Tri();
		Circle c = new Circle();
		r.calc();
		r.disp();
		t.calc();
		t.disp();
		c.calc();
		c.disp();
		*/
	}
}








