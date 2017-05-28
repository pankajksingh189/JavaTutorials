package string;
public class Manipulation {

	public static void main(String[] args) {
		
		//inefficient
		System.out.println("------------  String Class--------------------");
		String info="";
		info+="This is first line.";
		info+=" ";
		info+="This is third line.";
		System.out.println(info);
		
		// efficient 
		System.out.println(" 01----------------------------------");
		StringBuilder sb=new StringBuilder();
		sb.append("This is first line.");
		sb.append(" ");
		sb.append("This is second line.");
		System.out.println(sb);
	
		System.out.println("02----------------------------------");
		StringBuilder s=new StringBuilder();
		s.append("This is first line.")
		.append(" ")
		.append("This is second line.");
		System.out.println(s);
		
		// Formatting
		System.out.println("03----------------------------------");
		System.out.println("Here is some test. \tThat is a Tab. \nThis is a new line");
		int i=2;
		System.out.printf("Total cost %d and quantity is %d",5,i);
		System.out.print("\n");
		System.out.printf("Actual cost %.2f", 5.6988);
		
		
		
		
		
		
	}
	

}
