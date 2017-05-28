package stringOperations;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=5;
		int count=0;
		int fact=1;
		
		// check for prime
		for(int i=1;i<number;i++){
			int rem=number%i;
			if(rem==0){
				count++;
			}
		}
		
		if(count==1){
			System.out.println("Prime number");
		}
		else{
			System.out.println("Not a prime");
		}
		
		//calculate factorial
		for(int j=1;j<=number;j++){
			fact=fact*j;
		}
		
		System.out.println("factorial is: "+fact);

	}

}
