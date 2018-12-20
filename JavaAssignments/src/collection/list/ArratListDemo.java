package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
/*
-> Java ArrayList class can contain duplicate elements.
-> Java ArrayList class maintains insertion order.
-> Java ArrayList class is non synchronized.
-> Java ArrayList allows random access because array works at the index basis.
-> In Java ArrayList class, manipulation is slow because a lot of shifting needs to be occurred if any element is removed from the array list.
 */
import java.util.ListIterator;

public class ArratListDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();//creating arraylist  
		al.add("ArrayList_Ravi");//adding object in arraylist  
		al.add("ArrayList_Vijay");  
		al.add("ArrayList_Ravi");
		al.add("ArrayList_Ajay");  
		al.add("ArrayList_Pankaj");
		al.add("ArrayList_Rahul");  
		al.add("ArrayList_Sandeep");
		al.add("ArrayList_Vijay");
		
		System.out.println("Using Iterator");
		Iterator<String> itr=al.iterator();//getting Iterator from arraylist to traverse elements  
		while(itr.hasNext()) 
			System.out.println(itr.next());  

		System.out.println("\nUsing Advance for loop");
		for(String obj:al)  
			System.out.println(obj);  

		System.out.println("iterating the elements after removing the elements of al2...");  
		ArrayList<String> al2=new ArrayList<String>();  
		al2.add("ArrayList_Ravi");  
		al2.add("ArrayList_Vijay");  
		al.removeAll(al2); 
		System.out.println();
		Iterator<String> itr2=al.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}  
		
		System.out.println("iterating the elements after retaining the elements of al2...");  
		al2.add("ArrayList_Pankaj");  
		al2.add("ArrayList_Rahul");
		al2.add("ArrayList_Himanshu");
		al.retainAll(al2);  
		Iterator<String> itr3=al.iterator();  
		while(itr3.hasNext()){  
			System.out.println(itr3.next());  
		}
		
		System.out.println("Adding element at index 1 in al...");  
		al.add(1,"ArrayList_joshi");
		Iterator<String> itr4=al.iterator();  
		while(itr4.hasNext()){  
			System.out.println(itr4.next());  
		} 
		
		System.out.println("Checking if 'Pankaj' is present: " + al.contains("Pankaj"));
		
		ListIterator<String> itr5=al.listIterator();  
		System.out.println("traversing elements in forward direction...");  
		while(itr5.hasNext()){  
			System.out.println(itr5.next());  
		}  
		System.out.println("traversing elements in backward direction...");  
		while(itr5.hasPrevious()){  
			System.out.println(itr5.previous());  
		}
	}
}
