package pkg;

public class Calc extends Parent implements Sample, Test{ // 클래스 상속할 수 있음
	//					구현
	
	@Override
	public void add() {
	}
	
	@Override
	public void mtdAbs() {
	}
	
	Test test = new Test() {		// Interface의 객체화
		@Override
		public void mtdAbs() {
		}
		@Override
		public void mtdDefault() {
			Test.super.mtdDefault();
		}
	};

	

}
