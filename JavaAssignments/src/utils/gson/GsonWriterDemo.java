package utils.gson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* creating json in below format
 [
 	{
		"name" : "Pankaj",
		"email" : "abc@gmailcom.",
		"age" : 28,
		"family" : [{
				"age" : 20,
				"role" : "Son"
			}, {
				"age" : 54,
				"role" : "Father"
			}
		]
	}
] 

 */


import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class GsonWriterDemo {

	public static void main(String[] args) {
		Gson gsonWriter=new Gson();
		Family family=new Family(20, "Son");
		Family family1=new Family(54, "Father");
		List<Family> lst=new ArrayList<>();
		lst.add(family);
		lst.add(family1);
		Member member=new Member("Pankaj", "abc@gmailcom.",28 , lst);
		Member member1=new Member("Singh", "xyz@gmailcom.",28 , lst);

		String json=gsonWriter.toJson(member);
		String json1=gsonWriter.toJson(member1);
		System.out.println(json);

		try(FileWriter file = new FileWriter(System.getProperty("user.dir")+"/src/utils/gson/Member.json"))  // java 8 feature
		{
			BufferedWriter br=new BufferedWriter(file);
			br.write(json);
			br.write(json1);
			br.flush();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
}
