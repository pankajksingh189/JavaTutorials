package collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

/*

*/
public class ComparableDemo  {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		  
		Collections.sort(al);
		System.out.println("Sorting by age:");
		for(Student st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}
}
