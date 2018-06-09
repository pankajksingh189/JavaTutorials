package fileio;

import java.io.BufferedWriter;
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
	
		FileWriter file;
		BufferedWriter br = null;
		try {
			file = new FileWriter(System.getProperty("user.dir")+"/temp.txt");
			br=new BufferedWriter(file);
			br.write(number);
			br.flush();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		scan.close();
		br.close();
	}
}
