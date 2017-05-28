package array;

import java.util.ArrayList;
import java.util.List;

// program to merge 2 arrays and remove all the duplicate elements

public class ArrayMerge {

	public static void main(String[] args) {
		int [] array1={2,4,6,8,10,12,14,6,4,8};
		int[] array2={1,5,6,8,12,9,11,12,5,7};
		//int[] array=new int[array1.length+array2.length];
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list1=new ArrayList<Integer>();
		
		// combine the elements of 2 arrays into an array list
		for(int i=0;i<array1.length;i++){
			list.add(array1[i]);
		}
		for(int j=0;j<array2.length;j++){
			list.add(array2[j]);
		}

		//		Integer[] arrayMerge=list.toArray(new Integer[list.size()]);	// convert array list to array

		//		for(int i=0;i<list.size();i++){
		//			for(int j=i+1;j<list.size();j++){
		//				if(list.get(i)==list.get(j)){
		//					list.remove(j);
		//				}
		//			}
		//		}
		//
		//		System.out.print(list+",");

		// program to print those elements which are repeated exactly twice
		for(int i=0;i<list.size();i++){
			int count=0;
			for(int j=i+1;j<list.size();j++){
				if(list.get(i)==list.get(j)){
					count++;
				}
			}

			if(count==1){
				list1.add(list.get(i));
			}
		}

		System.out.print(list1+",");
	}

}
