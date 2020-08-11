package collectionExample;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
//	private static final Object EXAMPLE = new Object();
//	Map<String,Object> map = new HashMap();
//	
//	public Object add(String add){
//		
//		return map.put(add, EXAMPLE);
//	}
	
	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap();
		
		map.put("Name", "Swapnil");
		map.put("Rollno", "23");
		map.put("Address", "17,D-64,Camp");
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get("Name"));
		
		Set<String> keys = map.keySet();
		for(String key:keys)
		{
			System.out.println("Keys-->"+key+ " Value -->"+map.get(key));
		}
		
		Map<String,List<String>> map1 = new HashMap<String,List<String>>();
		
		List<String> listofEmails = new ArrayList<String>();
		listofEmails.add("swaps@gmail.com");
		listofEmails.add("swaps56@gmail.com");
		listofEmails.add("swapnilsup@gmail.com");
		
		map1.put("Emails", listofEmails);
		
		System.out.println(map1);
		
		
	}

}
