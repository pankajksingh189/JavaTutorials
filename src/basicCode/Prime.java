package basicCode;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		isPrime(number);
		isPrimeSimple(number);
	}



	public static boolean isPrime(int n) {  
		if (n <= 1) {  
			return false;  
		}  
		for (int i = 2; i <= Math.sqrt(n); i++) {  
			if (n % i == 0) {  
				return false;  
			}  
		}  
		return true;  
	}


	public static void isPrimeSimple(int number) {
	
		int count=0;
		int fact=1;

		// check for prime
		for(int i=1;i<number/2;i++){
			int rem=number%i;
			if(rem==0){
				count++;
			}
		}
		System.out.println("is prime :"+isPrime(number));

		if(count==1){
			System.out.println("Prime number");
		}
		else{
			System.out.println("Not a prime");
		}
	}
}
