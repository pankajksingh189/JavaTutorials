package stringOperations;

import java.util.Scanner;

public class StringCharacters {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();

		int count_lowerCase=0;
		int count_upperCase=0;
		int count_digits=0;
		int count_space=0;
		int count_duplicateChars=0;

		char[] characterString=str.toCharArray();

		//	method 1

//		for(int i=0;i<str.length();i++){
//			//int k=(int) str[i];	//error
//			if (Character.isLowerCase(str.charAt(i)))
//				count_lowerCase++;
//			else if(Character.isUpperCase(str.charAt(i)))
//				count_upperCase++;
//			else if(Character.isDigit(str.charAt(i)))
//				count_digits++;
//			else if(Character.isSpace(str.charAt(i)))
//				count_space++;
//		}


		// method 2

		for(int i=0;i<characterString.length;i++){
			int k=(int) characterString[i];	// gets ascii value of each character in string

			if (Character.isLowerCase(characterString[i]))
				count_lowerCase++;
			else if(Character.isUpperCase(characterString[i]))
				count_upperCase++;
			else if(Character.isDigit(characterString[i]))
				count_digits++;
			else if(Character.isSpace(characterString[i]))
				count_space++;

			//System.out.print(k+",");	// prints ascii values
		}

		for(int i=0;i<characterString.length;i++){
			for(int j=i+1;j<characterString.length;j++){
				if(characterString[i]==characterString[j]){
					System.out.println(characterString[j]+" is repeated at index "+(j+1));
				}
			}
		}

		System.out.println("no of lower case characters: "+count_lowerCase );
		System.out.println("no of upper case characters: "+count_upperCase );
		System.out.println("no of digits: "+count_digits );
		System.out.println("no of spaces: "+count_space );
		// also find count of letters
	}		

}


