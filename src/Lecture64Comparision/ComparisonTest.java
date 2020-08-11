package Lecture64Comparision;

public class ComparisonTest {

	public static void main(String[] args) {

		// Difference between == and .equals
		String str1 = "";
		String str2 ="";
		
//		System.out.println(str1==str2);       // True
//		
//		// ==  comparison operator which check Object references and object address are not
//		// .equals validate the content is same or not
//		
//		System.out.println(str1.equals(str2)); // True
//		
//		
//		String str_1 = new String("automation");
//		String str_2 = new String("automation");
//		
//		System.out.println(str_1==str_2);       // False
		
		// ==  comparison operator return false bcz we are actually comparing the address reference
		// if both the obj reference point to same location then it will return True 
		// so how we can achiev this -> by using singleton design pattern
		
//		System.out.println(str_1.equals(str_2));
		
		
		//creating multiple obj of SIngleTOn class
		// creating multi obj but calling one instance only
		
		SingleTonTest t = SingleTonTest.getInstance();
		SingleTonTest t1 = SingleTonTest.getInstance();
		
		// NOw if we run t==t1 then it will return true
		
		System.out.println(t==t1);
		
	}

}
