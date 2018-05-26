package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


/*
-> Collections in java is a framework that provides an architecture to store and manipulate the group of objects.
-> All the operations that you perform on a data such as searching, sorting, insertion, manipulation, deletion etc. can be performed by Java Collections.
*/


public class CollectionsFns {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();//creating arraylist  
		al.add("Ravi");//adding object in arraylist  
		al.add("Vijay");  
		al.add("Ravi");
		al.add("Ajay");  
		al.add("Pankaj");
		al.add("Rahul");  
		al.add("Sandeep");
		al.add("Vijay");
		al.add(null);
				
		System.out.println("No of times 'vijay is added :' "+Collections.frequency(al, "Vijay")); // gives number of times element is present
		System.out.println("Using Iterator");
		Iterator<String> itr=al.iterator();//getting Iterator from arraylist to traverse elements  
		while(itr.hasNext()) 
			System.out.println(itr.next());  

		System.out.println("\nUsing Advance for loop");
		for(String obj:al)  
			System.out.println(obj);  

		System.out.println("iterating the elements after removing the elements of al2...");  
		ArrayList<String> al2=new ArrayList<String>();  
		al2.add("Ravi");  
		al2.add("Vijay");  
		al.removeAll(al2); 
		al.remove("Sandeep"); 
		System.out.println();
		Iterator<String> itr2=al.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}  
		
		System.out.println("iterating the elements after retaining the elements of al2...");  
		al2.add("Pankaj");  
		al2.add("Rahul");
		al2.add("Himanshu");
		al.retainAll(al2);  
		Iterator<String> itr3=al.iterator();  
		while(itr3.hasNext()){  
			System.out.println(itr3.next());  
		}  
		System.out.println("Checking if 'Pankaj' is present: " + al.contains("Pankaj"));
		
		 List<Integer> list = new ArrayList<Integer>();  
		 list.add(46);  
	        list.add(67);  
	        list.add(24);
	       
	        System.out.println("Initial collection value:"+list);  
	        Collections.addAll(list, 22,100);  
	        System.out.println("After adding elements collection value:"+list);  
	        Integer[] val = {1,29,36};  
	        Collections.addAll(list, val);  
	        System.out.println("After adding array collection value:"+list);  
	        System.out.println("Value of maximum element from the collection: "+Collections.max(list)); 
	        System.out.println("Value of maximum element from the collection: "+Collections.min(list));
	        Collections.reverse(list);
	        System.out.println("Value of maximum element from the collection: "+list);
	        Collections.sort(list);
	        System.out.println("Value of maximum element from the collection: "+list);
	        Collections.reverse(list);
	        System.out.println("Value of maximum element from the collection: "+list);
	}
}
