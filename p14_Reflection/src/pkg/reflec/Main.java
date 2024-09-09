package pkg.reflec;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) {

		Class objCls = Fruit.class;

		Constructor[] constructors = objCls.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] params = constructor.getParameterTypes();
			for (int i = 0; i < params.length; i++) {
				System.out.print(params[i].getName());
				if (i < params.length - 1)
					System.out.print(",	");
			}
			System.out.println(")");
		}

		Field[] fields = objCls.getDeclaredFields();

		for (Field field : fields) {
			System.out.println(field.getType().getName());
			System.out.println(field.getName());
			System.out.println("----------------");
		}
	}

}
