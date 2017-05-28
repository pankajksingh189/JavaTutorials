package string;

import java.util.Scanner;

public class StringSearch {

	public static void main(String[] args) {
		
		System.out.println("Enter a string: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		if(str.contains("oct")){
			int index=str.indexOf("oct");
			System.out.println("Given text is found in string at "+index);
		}

	}

}
