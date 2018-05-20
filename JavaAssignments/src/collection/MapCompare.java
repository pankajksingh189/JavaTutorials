package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapCompare {

	public static void main(String[] args) {
		
		HashMap<String,String> hashMap=new HashMap<String,String>(); 
		LinkedHashMap<String,String> linkedMap=new LinkedHashMap<String,String>(); 
		TreeMap<String,String> treeMap=new TreeMap<String,String>();

		hashMap.put("Pakistan", "Islamabad"); 
		hashMap.put("India", "Delhi"); 
		hashMap.put("SriLanka","Colombo"); 
		
		System.out.println("HashMap keySet :"+hashMap.keySet());
		
		System.out.println("HashMap values :"+hashMap.values());

		linkedMap.put("Pakistan", "Islamabad"); 
		linkedMap.put("India", "Delhi"); 
		linkedMap.put("SriLanka","Colombo");

		System.out.println("LinkedHashMap keySet :"+linkedMap.keySet()); 
		System.out.println("LinkedHashMap values :"+linkedMap.values());

		treeMap.put("Pakistan", "Islamabad"); 
		treeMap.put("India", "Delhi"); 
		treeMap.put("SriLanka","Colombo"); 
		System.out.println("TreeMap keySet :"+treeMap.keySet()); 
		System.out.println("TreeMap values :"+treeMap.values());	// values are sorted based on key value
	}

}
