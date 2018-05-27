package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestCollection {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();	// List and set are interfaces. ArrayList is the concrete implementation of List Interface
		list.add("selenium");
		list.add("qtp");
		list.add("jmeter");
		System.out.println(list.get(1));

		for(String element:list){
			System.out.println(element);
		}

		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}


		Set<String> set=new HashSet<String>();
		set.add("squish");
		set.add("squish");
		set.add("charles");

		for(String element:set){
			System.out.println(element);
		}

		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		Map<String,String> map=new HashMap<String,String>();
		map.put("category", "test tool");
		map.put("name", "selenium");
		map.put("cost", "free");

		for(String key:map.keySet()){
			System.out.println(map.get(key));	// prints value
		}
		for(Entry<String,String> key:map.entrySet()){
			System.out.println(key.getKey() +" <-- >" +key.getValue());
		}
	}

}
