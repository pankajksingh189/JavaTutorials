package stringOperations;

import java.util.Scanner;

/**
 * @author pankaj
 *
 */

public class ReverseString {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=ob.nextLine();

		// method 1: through StringBuffer
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println("Using String buffer : "+sb.toString());	// print the string in reverse


		// method 2: storing string characters in a character array and then reversing it
		char[] str_array= new char[str.length()];
		for(int i=0;i<str.length();i++){
			str_array[i]=str.charAt(i);
		}
		
		System.out.println("Using Loop");
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str_array[i]);
		}
		System.out.println();

		// Print words of given string in reverse:"This is test" -> "test is This"
		String[] splitStr=str.split(" ");
		String finalStr="";
		for(int i = splitStr.length - 1; i >= 0; i-- ){
			finalStr=finalStr+splitStr[i]+" ";
		}
		System.out.print(finalStr.trim());
	}

}
