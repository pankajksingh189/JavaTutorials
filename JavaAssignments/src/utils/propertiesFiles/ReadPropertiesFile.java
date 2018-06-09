package utils.propertiesFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Map.Entry;

 
public class ReadPropertiesFile {

// Please execute WritePropertiesFile once to generate .properties file.
	public static void main(String[] args) {
		Properties prop=new Properties();
		InputStream input = null;

		try {
			input=new FileInputStream(System.getProperty("user.dir")+"/src/utils/propertiesFiles/config.properties");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println("name: "+prop.getProperty("name"));
			System.out.println("Email: "+prop.getProperty("email"));
			System.out.println("City: "+prop.getProperty("city"));

			
			System.out.println("/*** printing using Enumeration  ***/");
			Enumeration<?> e = prop.propertyNames();
			while(e.hasMoreElements()) {
				String key=(String) e.nextElement();
				String value = prop.getProperty(key);
				System.out.println("Key : " + key + ", Value : " + value);
			}

			System.out.println("/*** printing using entryset  ***/");
			for(Entry<Object, Object> key:prop.entrySet()){
				System.out.println(key.getKey() +" <-- >" +key.getValue());
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		
		}
		finally {
			if(input !=null)
				try {
					input.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
		}
	}
}
