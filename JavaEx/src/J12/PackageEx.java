package J12;

import J12.mypack.PackageOne;
import J12.mypack.PackageTwo;

public class PackageEx {
	public static void main(String[] args) {
		PackageOne one = new PackageOne();
		PackageTwo two = new PackageTwo();
		
		one.one();
		two.two();

	}

}
