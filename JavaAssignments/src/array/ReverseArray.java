package array;

// program to reverse elements in chunks of 3

public class ReverseArray {

	public static void main(String[] args) {

		int[]array={1,9,6,4,7,6,3,14,12};
		if((array.length)%3==0){
			for(int i=0;i<array.length;i+=3){
				if((i+2)<array.length){
					int temp=array[i];
					array[i]=array[i+2];
					array[i+2]=temp;
				}
			}
		}

		for(int j=0;j<array.length;j++){
			System.out.print(array[j]+",");
		}
	}

}
