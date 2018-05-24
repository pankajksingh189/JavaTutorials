package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
--> A map contains values on the basis of key i.e. key and value pair. Each key and value pair is known as an entry. Map contains only unique keys. 
--> Map is useful if you have to search, update or delete elements on the basis of key.
 */
public class A_MapBasics{

	public static void main(String[] args) {

		HashMap<String,String> hashMap=new HashMap<String,String>(); 
		hashMap.put("Pakistan", "Islamabad");  //It is used to insert an entry in this map.
		hashMap.put("India", "Delhi"); 
		hashMap.put("SriLanka","Colombo"); 

		System.out.println("It is used to return the value for the specified key :"+hashMap.get("India"));	
		System.out.println("It is used to return the value for the specified key :"+hashMap.get("Indiasd"));	 // Return null if element is not present
		System.out.println("It is used to search the specified key from this map :"+hashMap.containsKey("India"));
		System.out.println("It is used to search the specified key from this map :"+hashMap.containsValue("Delhi"));
		System.out.println("It is used to return the number of key-value mappings in this map :"+hashMap.isEmpty());	
		System.out.println("It is used to return the Set view containing all the keys :"+hashMap.keySet());
		System.out.println("It is used to return the Set view containing all the values :"+hashMap.values());
		System.out.println("It is used to return the Set view containing all the keys and values :"+hashMap.entrySet());
		System.out.println("It is used to return the number of key-value mappings in this map :"+hashMap.size());	



		Map <String,String> hashMap2=new HashMap<String,String>(); 
		hashMap2.put("Uttarakhand", "Dehradun"); 
		hashMap2.put("UttarPradesh", "Lucknow"); 

		hashMap.putAll(hashMap2);  //It is used to insert the specified map in this map.
		System.out.println("It is used to return the Set view containing all the keys :"+hashMap.keySet());
		System.out.println("It is used to return the Set view containing all the values :"+hashMap.values());



		//Traversing Map  - New Style
		for(Map.Entry<String,String> m:hashMap2.entrySet()){  
			System.out.println(m.getKey()+" --> "+m.getValue());  
		}  
		
		System.out.println("It is used to return the Set view containing all the keys and values :"+hashMap2.remove("UttarPradesh"));
		
		//Traversing Map -- Old Style
		Set set=hashMap2.entrySet();   //Converting to Set so that we can traverse  
		Iterator itr=set.iterator();  
		while(itr.hasNext()){  
			//Converting to Map.Entry so that we can get key and value separately  
			Map.Entry<String,String> entry=(Map.Entry)itr.next();  
			System.out.println(entry.getKey()+" <--> "+entry.getValue());  
		}  
	}

}
