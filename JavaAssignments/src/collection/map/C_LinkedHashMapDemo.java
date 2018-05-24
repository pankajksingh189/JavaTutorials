package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;
/*
--> A LinkedHashMap contains values based on the key.
--> It contains only unique elements.
--> It may have one null key and multiple null values.
--> It is same as LinkedHashMap instead maintains insertion order.
 */
public class C_LinkedHashMapDemo {

	public static void main(String[] args) {

		Map<String,String> lhm=new LinkedHashMap<String,String>(); 
		lhm.put("Pakistan", "Islamabad");  //It is used to insert an entry in this map.
		lhm.put("India", "Delhi"); 
		lhm.put("SriLanka","Colombo"); 

		System.out.println("It is used to return the value for the specified key :"+lhm.get("India"));		
		System.out.println("It is used to search the specified key from this map :"+lhm.containsKey("India"));
		System.out.println("It is used to search the specified key from this map :"+lhm.containsValue("Delhi"));
		System.out.println("It is used to return the Set view containing all the keys :"+lhm.keySet());
		System.out.println("It is used to return the Set view containing all the values :"+lhm.values());
		System.out.println("It is used to return the Set view containing all the keys and values :"+lhm.entrySet());	


		Map <String,String> lhm2=new LinkedHashMap<String,String>(); 
		lhm2.put("Uttarakhand", "Dehradun"); 
		lhm2.put("UttarPradesh", "Lucknow"); 

		lhm.putAll(lhm2);  //It is used to insert the specified map in this map.
		System.out.println("It is used to return the Set view containing all the keys :"+lhm.keySet());
		System.out.println("It is used to return the Set view containing all the values :"+lhm.values());
	}
}