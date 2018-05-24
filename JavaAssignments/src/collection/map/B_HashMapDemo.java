package collection.map;

import java.util.HashMap;
import java.util.Map;
/*
--> A HashMap contains values based on the key.
--> It contains only unique elements.
--> It may have one null key and multiple null values.
--> It maintains no order.
 */
public class B_HashMapDemo {

	public static void main(String[] args) {

		Map<String,String> hashMap=new HashMap<String,String>(); 
		hashMap.put("Pakistan", "Islamabad");  //It is used to insert an entry in this map.
		hashMap.put("India", "Delhi"); 
		hashMap.put("SriLanka","Colombo"); 

		System.out.println("It is used to return the value for the specified key :"+hashMap.get("India"));		
		System.out.println("It is used to search the specified key from this map :"+hashMap.containsKey("India"));
		System.out.println("It is used to search the specified key from this map :"+hashMap.containsValue("Delhi"));
		System.out.println("It is used to return the Set view containing all the keys :"+hashMap.keySet());
		System.out.println("It is used to return the Set view containing all the values :"+hashMap.values());
		System.out.println("It is used to return the Set view containing all the keys and values :"+hashMap.entrySet());	


		Map <String,String> hashMap2=new HashMap<String,String>(); 
		hashMap2.put("Uttarakhand", "Dehradun"); 
		hashMap2.put("UttarPradesh", "Lucknow"); 
		hashMap2.put(null, "Bangalore"); //It can hold one null key, 
		hashMap2.put(null, "Mumbai");  //overrides values incase of duplicate
		hashMap.putAll(hashMap2);  //It is used to insert the specified map in this map.
		System.out.println("It is used to return the Set view containing all the keys :"+hashMap.keySet());
		System.out.println("It is used to return the Set view containing all the values :"+hashMap.values());
		System.out.println("Checking with null key :"+hashMap.get(null)); 
		
		

	}
}