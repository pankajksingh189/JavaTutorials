package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArratListDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();//creating arraylist  
		al.add("Ravi");//adding object in arraylist  
		al.add("Vijay");  
		al.add("Ravi");
		al.add("Ajay");  
		al.add("Pankaj");
		System.out.println("Using Iterator");
		Iterator<String> itr=al.iterator();//getting Iterator from arraylist to traverse elements  
		while(itr.hasNext()) 
			System.out.println(itr.next());  

		System.out.println("\nUsing Advance for loop");
		for(String obj:al)  
			System.out.println(obj);  

		
		ArrayList<String> al2=new ArrayList<String>();  
		al2.add("Ravi");  
		al2.add("Ajay");  
		al.removeAll(al2);     
		System.out.println("iterating the elements after removing the elements of al2...");  
		Iterator<String> itr2=al.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}  
		
		al2.add("Pankaj");  
		
		al.retainAll(al2);  

		System.out.println("iterating the elements after retaining the elements of al2...");  
		Iterator<String> itr3=al.iterator();  
		while(itr3.hasNext()){  
			System.out.println(itr3.next());  
		}  
	}
}
