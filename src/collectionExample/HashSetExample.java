package collectionExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> sh = new HashSet();
		sh.add("NewTest-ExampleHashMap");
		sh.add("Automation");
		sh.add("Testing");
		sh.add("API Automation");
		sh.add("Manual Testing");
		
		//NO index to get value 
		
		for(String var :sh){
			System.out.println(var);
		}
		
		// Iterator
		Iterator<String> i = sh.iterator();
		while(i.hasNext()){
			String var =  i.next();
			if(var =="Testing"){

				System.out.println(var);
				
			}
		}
	}
}
