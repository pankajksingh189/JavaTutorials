package collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

/*

*/
public class ComparatorDemo  {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();  
		al.add(new Employee(1015,"Vijay",23));  
		al.add(new Employee(1064,"Ajay",38));  
		al.add(new Employee(1059,"Jai",19));  
		  
		Collections.sort(al,new AgeComparator());
		System.out.println("Sorting by age:");
		for(Employee st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		System.out.println();
		Collections.sort(al,new NameComparator());
		System.out.println("Sorting by Name:");
		for(Employee st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}
	}
}

/*
 * Comparable	vs Comparator
1) Comparable provides single sorting sequence. In other words, we can sort the collection on the basis of single element such as id or name or price etc.	
2) Comparable affects the original class i.e. actual class is modified.	
3) Comparable provides compareTo() method to sort elements.	
4) Comparable is found in java.lang package.	
5) We can sort the list elements of Comparable type by Collections.sort(List) method.	

1) Comparator provides multiple sorting sequence. In other words, we can sort the collection on the basis of multiple elements such as id, name and price etc.
2) Comparator doesn't affect the original class i.e. actual class is not modified.
3) Comparator provides compare() method to sort elements.
4) Comparator is found in java.util package.
5) We can sort the list elements of Comparator type by Collections.sort(List,Comparator) method.
*/
