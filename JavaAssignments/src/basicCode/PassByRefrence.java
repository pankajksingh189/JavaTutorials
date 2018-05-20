package basicCode;

class PassByRefrence {
/* Java is passed by value for primitive data type and by reference for non primitive*/
private int age;

	public static void passByReference(String a[]){
		a[0] = "Changed";
	}
	public static void passByReference(int x){
		x=50;
	}
	public static void passByReference(Integer x){
		x=60;
	}
	public static void passByReference(PassByRefrence x){
		x.age=60;
	}



	public static void main(String args[]){
		String []b={"Apple","Mango","Orange"};
		PassByRefrence.passByReference(b);
		System.out.println(b[0]);

		int y=20;
		PassByRefrence.passByReference(y);
		System.out.println(y);

		Integer z=new Integer(10);
		PassByRefrence.passByReference(z);
		System.out.println(z);

		PassByRefrence pr=new PassByRefrence();
		pr.age=20;
		System.out.println(pr.age);
		PassByRefrence.passByReference(pr);
		System.out.println(pr.age);
		
	}
}
