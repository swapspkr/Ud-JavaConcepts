package ReflectionExample;

import java.lang.reflect.Method;

public class Home {

	public static void main(String[] args) {
		Test t = new Test();
		Class testClassName = t.getClass();
		System.out.println(testClassName.getSimpleName());
	
		Method[] m = testClassName.getDeclaredMethods();
				System.out.println(m.length);
				for(Method metho:m){
					System.out.println("Method Name::"+metho.getName()+"-->ReturnType-->"+metho.getReturnType());
//					System.out.println("Modifiers::"+metho.getModifiers());
//					System.out.println("Returntyps: "+metho.getReturnType());
				}

	}

}
