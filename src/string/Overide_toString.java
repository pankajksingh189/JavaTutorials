package string;

public class Overide_toString {

	private int id;
	private String name;

	public Overide_toString(int i, String s){
		this.id=i;
		this.name=s;
	}

	//overide
	public String toString(){
		return id+ ":" +name;
	}

	public static void main(String[] args) {
		Overide_toString obj1=new Overide_toString(5,"Pankaj");
		Overide_toString obj2=new Overide_toString(7,"Singh");	
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
