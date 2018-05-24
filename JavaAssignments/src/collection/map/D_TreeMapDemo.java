package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
/*
--> A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
--> It contains only unique elements.
--> It cannot have null key but can have multiple null values.
--> It is same as HashMap instead maintains ascending order.
 */
public class D_TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<String,String> tm=new TreeMap<String,String>(); 
		tm.put("Pakistan", "Islamabad");  //It is used to insert an entry in this map.
		tm.put("India", "Delhi"); 
		tm.put("SriLanka","Colombo"); 
		//tm.put(null, "Bangalore");  // null point exception
		System.out.println("It is used to return the value for the specified key :"+tm.get("India"));		
		System.out.println("It is used to search the specified key from this map :"+tm.containsKey("India"));
		System.out.println("It is used to search the specified key from this map :"+tm.containsValue("Delhi"));
		System.out.println("It is used to return the Set view containing all the keys :"+tm.keySet());
		System.out.println("It is used to return the Set view containing all the values :"+tm.values());
		System.out.println("It is used to return the Set view containing all the keys and values :"+tm.entrySet());	


		Map <String,String> tm2=new LinkedHashMap<String,String>(); 
		tm2.put("Uttarakhand", "Dehradun"); 
		tm2.put("UttarPradesh", "Lucknow"); 

		tm.putAll(tm2);  //It is used to insert the specified map in this map.
		System.out.println("It is used to return the Set view containing all the keys :"+tm.keySet());
		System.out.println("It is used to return the Set view containing all the values :"+tm.values());
	}
}