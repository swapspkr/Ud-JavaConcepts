package ReflectionExample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testReflection {

	
	
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		String x = "click";
	
		Method method = testReflection.class.getMethod(x,String.class);
		method.invoke(method, "Hi..there!!!");
		//method.invoke(method, 10);
		
		
	}
	
	public static void click(String x){
		System.out.println("Executing test"+x);
	}
	
}
