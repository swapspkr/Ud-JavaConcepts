package collectionExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add("String");
		list.add(10.34);
		list.add("c");
		list.add(true);
		list.add(10);
		list.add(null);
		
		/*System.out.println(list);
		System.out.println(list.size());*/
		
		// fetch value ;
		
		//System.out.println(list.get(0));
		
		// remove value 
		list.remove(5);
		
		//print using iterator
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		// print using for each
		/*for(Object l : list){
			System.out.println(""+l);
		}*/
		
		
	}
}
