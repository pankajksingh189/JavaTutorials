package utils.gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class GsonReaderDemo {

	public static void main(String[] args){
		Gson gson =new Gson();
		FileReader file = null;
		BufferedReader json=null;
		try {
			file = new FileReader(System.getProperty("user.dir")+"/Member.json");
			json=new BufferedReader(file);
			System.out.println();
			if(json !=null) {
				Member member=gson.fromJson(json, Member.class);
				for(Family m: member.getFamily()) {
					System.out.println(m.getRole());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				json.close();
			} catch (IOException e) {
					e.printStackTrace();
			}
		}
	}
}
