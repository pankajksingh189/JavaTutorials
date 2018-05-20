/**
 * 
 */
package stringOperations;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String s="Pankaj Singh";
		Set<Character> set=new HashSet<>();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++){
			Character c=s.charAt(i);
			if(!set.contains(c)){
				set.add(c);
				sb.append(c);
			}
		}
		System.out.println("Before: "+s);
		System.out.println("After: "+sb.toString());	
	}
}
