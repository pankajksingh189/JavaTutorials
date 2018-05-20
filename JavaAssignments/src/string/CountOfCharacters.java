package string;

import java.util.HashMap;
import java.util.Map;

/*
 *  Program to print no of repetation of each alphabet in a string 
 */

public class CountOfCharacters {

	public static void main(String[] args) {
		String s="ammababctamantl slmag m";
		withCollection(s);
		usingSimpleForLoops(s); //wrong logic
	}

	public static void withCollection(String str) {
		int len = str.length();
		Map<Character, Integer> numChars = new HashMap<Character, Integer>(Math.min(len, 26));
		for (int i = 0; i < len; ++i){
			char charAt = str.charAt(i);
			if (!numChars.containsKey(charAt)){
				numChars.put(charAt, 1);
			}else{
				numChars.put(charAt, numChars.get(charAt) + 1);
			}
		}
		System.out.println(numChars);
	}

	public static void usingSimpleForLoops(String s) {
		int distinct = 0 ;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j))				{
					distinct++;
				}
			}   
			System.out.println(" '"+s.charAt(i)+"' is usead "+distinct+" times in string.");
			String d=String.valueOf(s.charAt(i)).trim();
			s=s.replaceAll(d,"");
			distinct = 0;
		}
	}
}
