package stringOperations;

public class DigitsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="nkjsgfiu5bjsb6kshdj0njdnx1b12";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
		}
	} 

}
