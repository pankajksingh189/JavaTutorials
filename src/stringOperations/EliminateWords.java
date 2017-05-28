package string;

import java.util.ArrayList;
import java.util.List;

// program to eliminate certain words from string
// logic that we have used is: store filtered string in a list and then print list content

public class EliminateWords {

	public static void main(String[] args) {
		String str="To be or not to be - that is the question: Whether it is nobler in the mind to suffer, the slings and arrows of outrageous fortune. Or to take up arms against a sea of troubles, and by opposing end them";
		String[] str_array={"a", "be", "to", "the", "that", "this", "or"};	//black words
		String[] splitStr = str.split(" ");
		
		List<String> ls = new ArrayList<>();

		for (int i = 0; i < splitStr.length; i++){
			int count=0;
			for(int j=0;j<str_array.length;j++){
				if(splitStr[i].contains(str_array[j])){
					count++;
				}
			}

			if(count==0){
				ls.add(splitStr[i]);
			}
		}

		for(String srt:ls){
			System.out.print(srt.toString()+" ");		
		}
	}

}
