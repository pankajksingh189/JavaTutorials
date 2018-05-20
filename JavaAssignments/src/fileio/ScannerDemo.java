package fileio;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter username");
		String userName= scanner.nextLine();
		System.out.println("Thanks "+ userName);
	}

}
