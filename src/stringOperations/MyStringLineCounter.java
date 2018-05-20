package stringOperations;

public class MyStringLineCounter {

	public static int getLineCount(String text){
		return text.split("[\n]").length;
	}
	public static void main(String a[]){
		String str = "line1\nline2\nline3\rline4";
		System.out.println(str);
		System.out.println("line count: "+getLineCount(str));
	}
}