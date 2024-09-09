package p09_DownCast;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Super obj = new Sub();
		Sub objSub = (Sub)obj;
		objSub.test();
		
		List<Object> list = new ArrayList<Object>();
		list.add(obj);
		list.get(0);
		
	}

}
