package collectionExample;

public class AutoBoxing {

	public static void main(String[] args) {

		int var = 10;
		Integer obj = new Integer(var); // wrapping
		System.out.println(obj);
		int i = obj; // unwrapping

	}

}
