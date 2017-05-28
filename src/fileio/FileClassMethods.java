package fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClassMethods {

	public static void main(String[] args) throws IOException {

		File myFile = new File("/Users/Prateek_Saxena03/Desktop/Attachment.txt");
		if (myFile.exists()) {
			System.out.println(myFile.getName() + " exists");
			System.out.println("The file is " + myFile.length() + " bytes long");
			if (myFile.canRead())
				System.out.println(" ok to read");
			else
				System.out.println(" not ok to read");
			if (myFile.canWrite())
				System.out.println(" ok to write");
			else
				System.out.println(" not ok to write");
			if (myFile.canExecute())
				System.out.println(" ok to execute");
			else
				System.out.println(" not ok to execute");
			System.out.println("path: " +myFile.getAbsolutePath());
			System.out.println("File Name: "+ myFile.getName());
			System.out.println("File Size: "+ myFile.length() + " bytes");

			FileReader freader = new FileReader("/Users/Prateek_Saxena03/Desktop/Attachment.txt");
			BufferedReader br = new BufferedReader(freader);
			String s;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			freader.close();

			//			String s = " This line will be written in File";
			//			System.out.println("Writing to File Data.txt: " + s);
			//
			//			try (FileWriter outFile = new FileWriter("Data.txt");
			//					BufferedWriter bWriter = new BufferedWriter(outFile)) {
			//				bWriter.write(s);
			//			} catch (IOException e) {
			//				e.printStackTrace();
			//			}


		} else
			System.out.println("File does not exist");

	}

}
