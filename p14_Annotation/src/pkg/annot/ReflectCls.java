package pkg.annot;

@SampleAnnotation
public class ReflectCls {

	private int num;

	public ReflectCls() {
	}

	@SampleAnnotation
	public void mtd1() {
		System.out.println("mtd1");
	}
	
	@SampleAnnotation("*")
	public void mtd2() {
		System.out.println("mtd2");
	}
	
	@SampleAnnotation(value="#", number=20)
	public void mtd3() {
		System.out.println("mtd3");
	}
	
}
