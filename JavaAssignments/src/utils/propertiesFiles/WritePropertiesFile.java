package utils.propertiesFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 * @author pankaj
 *
 * May 27, 2018 {5:54:38 PM}
 */
public class WritePropertiesFile {


	public static void main(String[] args) {
		Properties prop=new Properties();
		OutputStream output = null;

		try {
			output=new FileOutputStream(System.getProperty("user.dir")+"/config.properties");

			// set the properties value
			prop.setProperty("name", "Pankaj Singh");
			prop.setProperty("email", "abc@gmailcom");
			prop.setProperty("pin", "400076");
			prop.setProperty("city", "Mumbai");

			// save properties to project root folder
			prop.store(output, "SavingFile");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		finally {
			if(output !=null)
				try {
					output.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
		}
	}
}

