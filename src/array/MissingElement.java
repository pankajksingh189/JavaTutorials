package array;

public class MissingElement {

	public static void main(String[] args) {
		int[]array={6,7,9,10};
		int actual_sum=((array.length+1)/2)*(2*array[0]+(array.length));
		System.out.println(((array.length+1)/2));
		System.out.println(actual_sum);
		int array_sum=0;
		for(int i=0;i<array.length;i++){
			array_sum+=array[i];
		}
		System.out.println(array_sum);
		int missing_number=actual_sum-array_sum;
		System.out.println(missing_number);
	}

}
