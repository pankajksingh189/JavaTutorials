package fileio;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int number=scan.nextInt();
		System.out.println(number);
		BufferedWriter bw=new BufferedWriter(new FileWriter("/Users/Prateek_Saxena03/Desktop/Demo.txt", true));
		bw.write(number);
		
	}

}
