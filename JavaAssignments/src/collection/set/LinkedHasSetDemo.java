package collection.set;

import java.util.LinkedHashSet;

/*
--> Contains unique elements only like LinkedHaslhset.
--> Provides all optional set operations, and permits null elements.
--> Maintains insertion order.
 */

public class LinkedHasSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		// Adding element to LinkedHaslhset
		lhs.add("M");
		lhs.add("B");
		lhs.add("C");
		lhs.add(null);
		lhs.add("A");
		lhs.add("M");
		lhs.add("X");
		lhs.add(null);

		System.out.println("Size of LinkedHaslhset=" + lhs.size());
		System.out.println("Original LinkedHaslhset:" + lhs);

		System.out.println("Removing A from LinkedHaslhset: " + lhs.remove("A"));
		System.out.println("Trying to Remove Z which is not present: "+ lhs.remove("Z"));
		System.out.println("Checking if M is present=" + lhs.contains("M"));
		System.out.println("Updated LinkedHaslhset: " + lhs);
		System.out.println("\nUsing Advance for loop");
		for(String value:lhs)  
			System.out.print(value+" ");  
	}
}
