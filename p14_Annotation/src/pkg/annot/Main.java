package pkg.annot;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		Method[] methods = ReflectCls.class.getDeclaredMethods();
		
		for(Method method : methods) {
			
			SampleAnnotation sample = method.getAnnotation(SampleAnnotation.class);
			System.out.println("value : " + sample.value());
			System.out.println("number : " + sample.number());
			
			try {
				method.invoke(new ReflectCls());
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("--------------------------");
		}
	}

}
