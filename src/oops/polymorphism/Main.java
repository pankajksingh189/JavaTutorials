package oops.polymorphism;

public class Main {

	public void doSomething(int value) {
		System.out.println("Inside menthod with int argument");
	}
	public void doSomething(String name) {
		System.out.println("Inside menthod with String argument");
	}




	public static void main(String[] args) {
		/* OVERRDING */
		Doctor doctorObj = new Doctor(); 
		doctorObj.treatPatient(); // treatPatient method in class Doctor will be executed

		Surgeon surgeonObj = new Surgeon();
		surgeonObj.treatPatient();// treatPatient  method in class Surgeon  will be executed

		Doctor doctorObj01 = new Surgeon();
		doctorObj01.treatPatient(); //[OVERLOADING] treatPatient  method in class Surgeon  will be executed

		Surgeon x= (Surgeon)doctorObj01; // when you want to use other methods of child class
		x.VerifyBill();

		System.out.println(doctorObj01.fee); // cann't override static

		//Surgeon surgeonObj02 = new Doctor(); // compilation error . Child class can't hold parent class object


		/* OVERLOADING */
		
		Main m=new Main();
		m.doSomething(10);
		m.doSomething("anything");
				
	}

}
