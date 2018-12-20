package oops.polymorphism;

public class Doctor {
	static int fee=500; 
	
	public void treatPatient(){
		System.out.println("I am a doctor, I do basic check-ups. My Fee is "+fee);

	}
	
	public void createReceipt(){
		System.out.println("I am creating Bill");

	}
}
