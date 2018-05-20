package string;

import java.util.Scanner;

// comparing 2 strings ignoring white spaces
public class StringComparison {

	public static void main(String[] args) {
		System.out.println("Enter string1: ");
		Scanner scan1=new Scanner(System.in);
		String str1=scan1.nextLine();

		System.out.println("Enter string2: ");
		Scanner scan2=new Scanner(System.in);
		String str2=scan2.nextLine();


		// method 1: using replace function
		usingReplace(str1,str2);

		//method 2: without using replace function
		withoutUsingReplace(str1,str2);


	}

	public static void usingReplace(String str1, String str2) {
		System.out.println("using replace: ");
		if(str1.replace(" ", "").equalsIgnoreCase(str2.replace(" ", ""))){
			System.out.println("Strings are equal");

		}else{
			System.out.println("Strings are not equal");	
		}
		System.out.println();

	}

	public static void withoutUsingReplace(String str1, String str2) {
		System.out.println("without using replace: ");
		char[] str_array1=new char[str1.length()];
		char[] str_array2=new char[str2.length()];
		String str1_modify="";
		String str2_modify="";
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)!=' '){	// ignores whitespace
				str_array1[i]=str1.charAt(i);	
				str1_modify=str1_modify+str_array1[i];
			}
		}
		for(int i=0;i<str2.length();i++){
			if(str2.charAt(i)!=' '){
				str_array2[i]=str2.charAt(i);	
				str2_modify=str2_modify+str_array2[i];
			}
		}
		if(str1_modify.equalsIgnoreCase(str2_modify)){
			System.out.println("Strings are equal");
		}else{
			System.out.println("Strings are not equal");	
		}

	}

}
