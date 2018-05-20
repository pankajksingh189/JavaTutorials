package oops.polymorphism;



public class Surgeon extends Doctor{
	static int fee=100; 

	public void VerifyBill(){
		System.out.println("I am verifying Bill");

	}
	public void treatPatient(){
		//super.treatPatient(); // if you wan to base class method and then child class
		System.out.println("I am a Surgeon, I do surgery. My Fee is "+fee);

	}	  
}
