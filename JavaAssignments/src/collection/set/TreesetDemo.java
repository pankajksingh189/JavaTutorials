package collection.set;

import java.util.TreeSet;

/*
--> Contains unique elements only like HashSet.
--> Access and retrieval times are quiet fast.
--> Maintains ascending order.
*/
public class TreesetDemo {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Sachin");
		ts.add("Zahir");
		ts.add("Mahi");
		ts.add("Bhajji");
		ts.add("Viru");
		ts.add("Gautam");
		ts.add("Ishant");
		ts.add("Umesh");
		ts.add("Pathan");
		ts.add("Virat");
		ts.add("Sachin"); // This is duplicate element so will not be added again
		//below will print list in alphabetic order
		System.out.println("Original Set:" + ts); 		
		System.out.println("First Name: "+ ts.first());
		System.out.println("Last Name: "+ ts.last());
		for(String value:ts)  
			System.out.println(value);  
	}
}
