package collection.list;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class LinkedListDemo {
	/*
-> Java LinkedList class can contain duplicate elements.
-> Java LinkedList class maintains insertion order.
-> Java LinkedList class is non synchronized.
-> In Java LinkedList class, manipulation is fast because no shifting needs to be occurred.
-> Java LinkedList class can be used as list, stack or queue.
	 */
	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();//creating Linkedlist  
		al.add("Ravi");//adding object in LinkedList  
		al.add("Vijay");  
		al.add("Ravi");
		al.add("Ajay");  
		al.add("Pankaj");
		al.add("Rahul");  
		al.add("Sandeep");
		al.add("Vijay");

		System.out.println("Using Iterator");
		Iterator<String> itr=al.iterator();//getting Iterator from LinkedList to traverse elements  
		while(itr.hasNext()) 
			System.out.println(itr.next());  

		System.out.println("\nUsing Advance for loop");
		for(String obj:al)  
			System.out.println(obj);  

		System.out.println("iterating the elements after removing the elements of al2...");  
		LinkedList<String> al2=new LinkedList<String>();  
		al2.add("Ravi");  
		al2.add("Vijay");  
		al.removeAll(al2); 
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

		System.out.println("Adding element at index 1 in al...");  
		al.add(1,"joshi");
		Iterator<String> itr4=al.iterator();  
		while(itr4.hasNext()){  
			System.out.println(itr4.next());  
		} 

/* 
boolean hasNext() --> This method return true if the list iterator has more elements when traversing the list in the forward direction.
Object next() --> This method return the next element in the list and advances the cursor position.
boolean hasPrevious() --> This method return true if this list iterator has more elements when traversing the list in the reverse direction.
Object previous() --> This method return the previous element in the list and moves the cursor position backwards.
 */
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
