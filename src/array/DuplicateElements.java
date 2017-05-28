package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] array={4,3,5,6,5,7,8,4};

		// loop to print all duplicate elements
		for(int i=0;i<array.length;i++){
			int count=0;
			for(int j=i+1;j<array.length;j++){
				if(array[i]==array[j]){
					count++;
				}
			}
			System.out.println(array[i]+" is repeated "+count+" times");
		}
		
		// remove all the duplicate array elements: this can also be done by converting array to array list and then using remove function on list
		System.out.println("Array elements after removing duplicates:");
		Set<Integer> hs1=new HashSet<Integer>();
		for(int i=0;i<array.length;i++){
			hs1.add(array[i]);
		}
		Iterator it = hs1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+",");
		}

		// following approach is used to find first duplicate element ie- 5 and not 4
		//Use hashset because it has a function that can be used for finding the duplicates (public boolean add(obj) )

		System.out.println("Printing first duplicate element");
		int duplicate=-1;
		Set<Integer> hs=new HashSet<Integer>();
		boolean isUnique=false;
		for(int i:array){

			isUnique=hs.add(i);	//add array elements to set. false is returned on trying to add duplicate element
			if(isUnique==false)
			{
				duplicate=i;
				break;
			}
		}
		
		System.out.println(duplicate+" is the first array element that is duplicated");

		// loop to print all the duplicate elements of array list
		
		List list=Arrays.asList(array);	// convert array to array list. Don't use generics such as Integer as RHS returns List<int[]>
		Iterator it1=list.iterator();
		
	}

}
